public class TestOrder {
     public static void main(String[] args) {
          VendingMachine test =new VendingMachine ();
          // add snacks into machine
          test.AddSnacks("Snack A",2,8);
          test.AddSnacks("Snack B",6,7);
          test.AddSnacks("Snack C",5,6);
          test.AddSnacks("Snack D",7,4);
          test.AddSnacks("Snack E",4,5);
          test.AddSnacks("Snack F",5,7);
          test.AddSnacks("Snack G",2,5);
          test.AddSnacks("Snack H",7,3);
          test.AddSnacks("Snack I",3,9);
          test.AddSnacks("Snack J",2,6);
          test.AddSnacks("Snack K",7,8);
          test.AddSnacks("Snack L",3,6);
          test.AddSnacks("Snack M",5,5);
          test.AddSnacks("Snack N",7,3);
          test.AddSnacks("Snack O",2,4);
          test.AddSnacks("Snack P",4,6);
          test.AddSnacks("Snack Q",3,2);
          test.AddSnacks("Snack R",1,7);
          test.AddSnacks("Snack S",2,8);
          test.AddSnacks("Snack T",7,2);
          test.AddSnacks("Snack U",1,5);
          test.AddSnacks("Snack V",4,4);
          test.AddSnacks("Snack V",5,3);
          test.AddSnacks("Snack W",3,2);
          test.AddSnacks("Snack X",2,0);
          // make a new order
          test.newOrder();   
     }
}
