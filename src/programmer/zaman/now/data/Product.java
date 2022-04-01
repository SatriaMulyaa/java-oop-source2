package programmer.zaman.now.data;

 public class Product {
  public String name;
  public int price;

     public Product(String name, int price){
         this.name = name;
         this.price = price;
     }

     public String toString() {
         return "product name: " + name + ", price: " + price;
     }

//     public boolean equals(Object o){
//         // ini bisa true kalau misal bandingin dengan object yang sama
//         if(this == o){
//             return true;
//         }
//
//         if(!(o instanceof Product)){
//            return false;
//         }
//
//         Product product = (Product) o;
//
//         if(this.price != product.price){
//             return false;
//         }
//         return product.name != null? this.name.equals(product.name) : product.name == null;
//
//     }

     public boolean equals(Object o) {
         System.out.println(this);
         System.out.println(o);
         if (this == o) return true;

         if (o == null || getClass() != o.getClass()) return false;

//         System.out.println(this);  object first
//         System.out.println(o);   object second
         Product product = (Product) o;

         if (price != product.price) return false;
         return name != null ? name.equals(product.name) : product.name == null;
     }

 }

