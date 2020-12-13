package com.galvanize;

public class Application {

    public static void main(String args[]){
        if(null == args){
            System.out.print("Please specify a name and email");
        }else{
            if(args[0].contains("\"")){
                String output = args[0].replace("\" "," <").replace("\"","").replace(".com",".com>");
                System.out.print(output);
            }else if(!args[0].contains(".com")) {
                System.out.print("Please specify an email for "+args[0]);
            }
            else{
                String output = args[0].replace(" "," <").replace(".com",".com>");
                System.out.print(output);
            }
        }
    }
}
