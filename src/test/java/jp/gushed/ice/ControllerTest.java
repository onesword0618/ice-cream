/**
 * 
 */
package jp.gushed.ice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author onesword0618
 *
 */
class ControllerTest {

    @Test
    void Get() {
        final Controller controller = new Controller();
        Assertions.assertAll(() -> Assertions.assertEquals(controller.get(), "Request Success!"));
    }

}
