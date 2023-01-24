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

