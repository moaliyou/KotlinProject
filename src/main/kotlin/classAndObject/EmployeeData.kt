package classAndObject

class Employee (private val name: String, private val age: Int) {

    fun displayEmployeeInfo() {
        println("Name of Employee : $name")
        println("Age of Employee : $age")
    }

}

class Data (private val salary: Double, private val address: String, private var employee: Employee) {

    var isEmployed: Boolean = false

    fun displayData() {
        employee.displayEmployeeInfo()
        println("Salary of Employee : $salary")
        println("Address of Employee : $address")
        when {
            isEmployed -> println("Part of the company.")
            !isEmployed -> println("Not part of the company.")
        }
    }

}

fun main() {

    val mEmployee = Employee("Mohamed", 20)

    val mData = Data(250.0, "Howlwadag District", mEmployee)
    mData.isEmployed = true

    mData.displayData()

}