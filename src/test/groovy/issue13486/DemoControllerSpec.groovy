package issue13486

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class DemoControllerSpec extends Specification implements ControllerUnitTest<DemoController> {

     void "test index action"() {
        when: 'the controller action is invoked'
        controller.list()

        then:
        noExceptionThrown()
     }
}
