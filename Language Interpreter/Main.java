// Language Interpreter Starter   A+CR
class Main
 {

    public static void main(String[] args) {
          Lexicon speak = new Lexicon();
          for (int i = 0; i < 16; i++) {
            String sample = speak.getSample(i);
            System.out.println("The original phrase is..." + sample);
            for (int j = 0; j < sample.length()-3; j++){
                  if(sample.substring(j, j+3).equals("ent")){
                        sample = sample.replace(sample.substring(j, j+3), "");
                        j = j-1;
                  }
            }
            for (int m = 0; m < sample.length()-4; m++){
                  if(sample.substring(m, m+4).equals("ingy")){
                        sample = sample.replace(sample.substring(m, m+4), "");
                        m = m-1;
                  }  
            }
            System.out.println("The translated version is..." + sample);
            System.out.println("");
          }
    }
  }