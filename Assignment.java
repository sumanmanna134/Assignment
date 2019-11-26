

public class assignemnt {

    public static void main(String[] args){
        String statement =  "Java and JavaScript repeat are totally different, JavaScript follows Java";
        int count;
        String repeat=" ";
        statement = statement.toLowerCase();
        System.out.println("Given Statement "+statement);
        String clean_statement = statement.replaceAll("\\s*,\\s*", " ");
        System.out.println("Clean Statement "+clean_statement);
        String token[] = clean_statement.split(" ");
        System.out.println("No of Token "+token.length);

        System.out.println("Duplicate Words:");
        for(int i=0;i<token.length;i++){
            count=1;
            for(int j=i+1;j<token.length;j++){
                if(token[i].equals(token[j])){
                    count++;
                    token[j]=repeat;
                }
            }
            if(count>1 && token[i]!=repeat){
                System.out.println(token[i]+" occurs "+count+" times");

            }
        }


    }
}

