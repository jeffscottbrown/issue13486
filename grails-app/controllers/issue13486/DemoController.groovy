package issue13486


class DemoController {
    def list(DemoCommand x) {
    }

    // commenting out this method or the variable declaration in it
    // will allow the unit test to pass
    private void placeToDeclareLocalVariable() {
        String x;
    }

}

class DemoCommand {
}