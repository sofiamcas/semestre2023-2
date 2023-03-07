public class Main {
    public static void main(String[] args) {

        //longitud de una cadena
        String s = "Hola";
        int x = s.length();
        System.out.println(x);

        //Determina si una cadena está vacía
        String s1 = "Hola";
        boolean b1 = s1.isEmpty();
        System.out.println(b1);

        String s2 = "";
        boolean b2 = s2.isEmpty();
        System.out.println(b2);

        //Acceder a los caracteres de una cadena
        String t = "Hola";
        for(int i=0; i<t.length(); i++)
        {
            char c = t.charAt(i);
            System.out.println(c);
        }

        //Comparar cadenas
        String u = "Hola";
        String y = "Hola";

        if(u.equals(y))
        {
            System.out.println("SI pasa por aquí!");
        }

        //Determinar la posición que ocupa un carácter dentro de una cadena
        String o = "Hola, como estas?";
        int p1 = o.indexOf('a');
        int p2 = o.lastIndexOf('a');
        System.out.println(p1);
        System.out.println(p2);

        //Determinar la posicion que ocupa una subcaena dentro de una cadena
        String d = "Hola, como estas? Estas como querias?";
        int r1 = d.indexOf("como");
        int r2 = d.indexOf("estas");
        int r3 = d.lastIndexOf("como");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        //Convertir a mayúsculas y minusculas
        String g = "Hola, como estas?";
        String may = g.toUpperCase();
        String min = g.toLowerCase();
        System.out.println(may);
        System.out.println(min);

        //Subcadenas
        String h = "Hola, como estas?";
        String h1 = h.substring(0,4);
        String h2 = h.substring(6,10);
        String h3 = h.substring(11);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        //Conversion entre cadenas y números
        //enteros
        String j1 = "1234";
        int m = Integer.parseInt(j1);
        String t1 = Integer.toString(m);
        System.out.println(m);
        System.out.println(t1);

        //flotantes
        String j2 = "1234.56";
        double e = Double.parseDouble(j2);
        String t2 = Double.toString(e);
        System.out.println(e);
        System.out.println(t2);

        //Concatenar cadenas
        String v = "Hola, ";
        String f = "que tal?";
        String w = v+f;
        System.out.println(w);

        //Invarianza de las cadenas de caracteres
        String n = "Hola";
        n = "chau";
        System.out.println(n);

        //
        String q = "Hola";
        q+=", chau";
        System.out.println(q);

        //Cadenas de caracteres Dinamicas
            // Concatenar caenas de caracterees
        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append("Chau");
        System.out.println(sb);

            //Modificar los caracteres de una cadena
        StringBuilder bb = new StringBuilder("Hola");
        bb.setCharAt(2,'X');
        System.out.println(bb);

    }

}