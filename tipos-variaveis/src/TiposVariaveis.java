public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        byte tiny = 100;
        short small = 32766;
        int big = 2000000009;
        /* Tipo long sempre encerra o número com L. Ex.:
        * long cpf = 41128248824L;
        */
        long huge = -9000000000000000001L; 
        
        float smallFloat = 20000123123123123123123100009.1231F;
        /* Tipo float sempre encerra o número com F. Ex.:
         * float pi = 3.14F;
         */
        double bigDouble = -345678236481234681468132576238147561238541851872638741623847612834612384612384761238476123847612837461827364812734812634871263487136.999;

        System.out.println("Esses são os tipos numéricos:");
        System.out.println("- \"byte\" que possui 1 byte e aceita valores que vão de -128 até 127. Exemplo: " + tiny);
        System.out.println("- \"short\" que possuem 2 bytes e aceita valores que vão de -32,768 até 32,767. Exemplo: " + small);
        System.out.println("- \"int\" que possuem 4 bytes e aceita valores que vão de -2,147,483,648 até 2,147,483,647. Exemplo: " + big);
        System.out.println("- \"long\" que possuem 8 bytes e aceita valores que vão de -9,223,372,036,854,775,808 até 9,223,372,036,854,775,807 e precisam ser declarados com um \"L\" ao final do número. Exemplo: " + huge);
        System.out.println("- \"float\" que possuem 4 bytes e aceita valores que vão de -3,4028E38 até 3,4028E38 e precisam ser declarados com um \"F\" ao final do número. Exemplo: " + smallFloat);
        System.out.println("- \"double\" que possuem 8 bytes e aceita valores que vão de -1,7976E308 até -1,7976E308. Exemplo: " + bigDouble);
    }

}
