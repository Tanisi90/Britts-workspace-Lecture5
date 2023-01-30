public class ChatBotService {
    //instance variables - instance variables will be useable throughout my class. But each 
    //object will hold it's own copy. 
    String cbslanguage;
    int timeUsed;

    public String helloMessage(){
        if(cbslanguage.equalsIgnoreCase("English")){
            return "Hello!";
        }else if(cbslanguage.equalsIgnoreCase("Chinese")){
            return "Ni Hao";
        }else if(cbslanguage.equalsIgnoreCase("Spanish")){
            return "Hola";
        }else if(cbslanguage.equalsIgnoreCase("Hindi")){
            return "Namaskar";
        }else{
            return "I'm sorry I don't understand. ";
        }
        
    }

    public String goodMessage(){
        if(cbslanguage.equalsIgnoreCase("English")){
            return "Goodbye";
        }else if(cbslanguage.equalsIgnoreCase("Chinese")){
            return "Bye Bye";
        }else if(cbslanguage.equalsIgnoreCase("Spanish")){
            return "Adios";
        }else if(cbslanguage.equalsIgnoreCase("Hindi")){
            return "अलविदा";
        }
        return "Sorry I don't understand what you would like me to do.";
    }
    
}
