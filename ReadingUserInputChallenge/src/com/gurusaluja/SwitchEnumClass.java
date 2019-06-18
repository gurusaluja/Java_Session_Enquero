package com.gurusaluja;


public class SwitchEnumClass {
    public enum Day{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
    }
    String workStatus(Day d)
    {
        switch(d) {
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday: {
                return "Do Work";
            }
            case Saturday:case Sunday:
            {
                return "This is Weekend! Do whatever you want to do!";
            }
        }
        return "Invalid Input";
    }
}
