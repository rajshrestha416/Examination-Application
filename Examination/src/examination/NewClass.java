/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class NewClass {
    
    public static void main(String[] args){
        
        Object row1[] = {1,2,3,4,5};
        Object row2[] = {6,7,8,9,10};
        ArrayList question = new ArrayList();
        question.add(row1);
        question.add(row2);
        
        System.out.println(row1[0]);
        Object row3[] = (Object[]) question.get(1);
        System.out.println(row3[2]);
    }
}
