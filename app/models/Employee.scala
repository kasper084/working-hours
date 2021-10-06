package models

case class Employee(id: Long,
                    name: String,
                    organisationId: Long,
                    specialisation: String,
                    hourCost: Double) {

}

object Employee {

}
