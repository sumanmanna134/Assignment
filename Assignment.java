

import java.util.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class assignment {
    public static void main(String[] args) throws Exception {  
        String Statement= "Java and JavaScript repeat are totally different, JavaScript follows Java";
        Set<String> duplicates_words = duplicate_test(Statement.toLowerCase());
        System.out.println( duplicates_words);
    }

    public static Set<String> duplicate_test(String input_statement){
        int count=0;
        
        if(input_statement== null || input_statement.isEmpty()){
            return Collections.emptySet();
        }
        Set<String> repeated_words = new HashSet<>();
        //List<Integer> a = new ArrayList<Integer>();
        String clean_statement = input_statement.replaceAll("\\s*,\\s*", " ");
        String token[] = clean_statement.split(" ");
        System.out.println("Number of Splited Token " + token.length);
        Set<String> set = new HashSet<>();
        
        for(String Tokens : token){
            if(!set.add(Tokens)){
                //count++;
                repeated_words.add(Tokens);
                
                
                
            }
            
            
        }
        
        //a.add(count);
        //System.out.println(a);
        
        
        
        return repeated_words;




    }
}
