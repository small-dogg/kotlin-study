package kotlinstudy.ch03.collection

import java.lang.IllegalArgumentException

class User(val id: Int, val name:String, val address: String)

fun saveUser(user: User) {
    //    if (user.name.isEmpty()) {
//        throw IllegalArgumentException(
//            "Can't save user ${user.id} : empty Name"
//        )
//    }
//
//    if (user.address.isEmpty()) {
//        throw IllegalArgumentException(
//            "Can't save user ${user.id} : empty Address"
//        )
//    }
//----------------------------------------------------------------------
//    fun validate(user: User, value: String, fieldName: String) {
//        if (value.isEmpty()) {
//            throw IllegalArgumentException(
//                "Can't ave user ${user.id} : empty $fieldName"
//            )
//        }
//    }
//
//    validate(user, user.name, "Name")
//    validate(user, user.address, "Address")
//----------------------------------------------------------------------
//    fun validate(value: String, filedName: String) {
//        if (value.isEmpty()) {
//            throw IllegalArgumentException(
//                "Can't save user ${user.id}: empty $filedName"
//            )
//        }
//    }
//    validate(user.name, "Name")
//    validate(user.address, "Address")
//----------------------------------------------------------------------
    user.validateBeforeSave()
}

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't ave user $id : empty $fieldName"
            )
        }
    }
}