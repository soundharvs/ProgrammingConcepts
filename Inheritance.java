class Routine {

    public void wakeup() {
      System.out.println("I wakeup at 6.30 AM");
    }
  }
  
  class Afternoon extends Routine {
  
    public void lunch() {
      System.out.println("I eat lunch at !2.30 PM");
    }
  
    public void tea() {
      System.out.println("I drink tea at 4.45 PM");
    }
  }
  
  class Inheritance {
    public static void main(String[] args) {

      Afternoon an = new Afternoon();

      an.lunch();
      an.tea();
    }
  }