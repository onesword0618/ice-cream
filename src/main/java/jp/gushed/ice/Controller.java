/**
 * 
 */
package jp.gushed.ice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author onesword0618
 *
 */
@RestController
class Controller {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    String get() {
        return "Request Success!";
    }

}
