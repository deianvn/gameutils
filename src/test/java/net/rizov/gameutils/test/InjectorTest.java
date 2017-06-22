package net.rizov.gameutils.test;

import net.rizov.gameutils.scene.Factory;
import net.rizov.gameutils.scene.Game;
import org.junit.Assert;
import org.junit.Test;

public class InjectorTest {

    @Test
    public void injectorUsage() {
        String testMsg = "test";
        Game game = new Game();
        game.addFactory(TestInterface.class, createFactory(testMsg));
        TestInterface testInterface = game.inject(TestInterface.class);
        Assert.assertEquals("Message should be: " + testMsg, testMsg, testInterface.test());
    }

    private Factory createFactory(final String msg) {
        return new Factory<TestInterface>() {
            @Override
            public TestInterface create() {
                return new TestImplementation(msg);
            }
        };
    }

}

interface TestInterface {
    String test();
}

class TestImplementation implements TestInterface {

    private String msg;

    public TestImplementation(String msg) {
        this.msg = msg;
    }

    @Override
    public String test() {
        return msg;
    }
}
