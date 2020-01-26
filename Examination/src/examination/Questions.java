/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

/**
 *
 * @author User
 */
public class Questions {
    
    private String question,answer,option1,option2,option3,option4;
    private int Set_Id;
    public Questions(String question,String answer,String option1,String option2,String option3,String option4,int Set_Id)
    {
        this.Set_Id = Set_Id;
        this.question = question;
        this.answer = answer;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
    
    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return answer;
    }
    public String getOption1(){
        return option1;
    }
    public String getOption2(){
        return option2;
    }
    public String getOption3(){
        return option3;
    }
    public String getOption4(){
        return option4;
    }
    
}
