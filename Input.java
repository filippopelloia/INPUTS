class Input {
    public static void main(String[] args){
        String location = "San Donà di Piave";
        String name = "Filippo";
        String lastName = "Pelloia";
        char yellowstone = '=';

        String formattedString = 
            String.format("Hello, this is %s - from %s %s %c Kang the Conqueror" , 
            location, name, lastName, yellowstone);

        System.out.println(formattedString);
    } 
}