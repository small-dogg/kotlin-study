package kotlinstudy.ch04

class Button: View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonState: State {} // 코틀린 주첩 클래스에 아무런 변경자가 붙지 않으면 자바 static 중첩 클래스와 같다.
}