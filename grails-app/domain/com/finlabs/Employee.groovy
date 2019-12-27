package com.finlabs

class Employee {

    String surname
    String givenNames
    Office office
    int extension
    Date hired
    int salary

    static constraints = {
        surname nullable: false, blank: false
        givenNames nullable: false, blank: false
        office nullable: false
        extension nullable: false
        hired nullable: false
        salary nullable: false
    }
}
