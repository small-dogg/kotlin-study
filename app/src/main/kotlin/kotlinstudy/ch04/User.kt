package kotlinstudy.ch04

//주 생성자
//class User (val nickname: String)

// this.nickname = nickname -> nickname = _nickname
//class User constructor(_nickname: String){
//    val nickname: String
//    init {
//        nickname = _nickname
//    }
//}


//축약형
//class User(_nickname: String){
//    val nickname = _nickname
//}


//디폴트 값 정의
//class User(val nickname: String, val isSubscribed: Boolean = true)
//
//fun main() {
//    val hyun = User("현석")
//    val gye = User("계영", true)
//    val hey = User("혜원", isSubscribed = true)
//}


//open class User(val nickname: String) {}
////기반클래스의 생성자 호출
//class TwitterUser(nickname: String) : User(nickname) {}

//외부에서 인스턴스화 하지 못하게 막으려면 이처럼 priavate 변경자로 인스턴스 생성을 막을 수 있음
//class Secretive private constructor(){}

//