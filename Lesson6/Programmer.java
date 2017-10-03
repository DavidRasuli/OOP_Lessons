package Lesson6;

public class Programmer extends Person
{
    private String programmingLanguage;



    public String getData()
    {
        return super.getData() + " Programming language : " + programmingLanguage;
    }


}

