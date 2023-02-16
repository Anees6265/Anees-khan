import java.util.Scanner;
class family {
  // int temp;
  String name;
  int age;
  String parents;

  family(String name, int age, String parents) {
    this.name = name;
    this.age = age;
    this.parents = parents;
  }

  public void display() {
    System.out.println(name + "\t" + age + "\t");
  }
}

public class familytree {
  public static void main(String[] args) {
    family[] str = new family[18];
    str[0] = new family("Khaju khan", 87, "dummy");
    str[1] = new family("Gulsan khan", 81, "dumy");
    str[2] = new family("Hamje khan", 62, "Khaju khan & Gulsan khan");
    str[3] = new family("Anaad khan", 57, "Khaju khan & Gulsan khan");
    str[4] = new family("Babu khan", 52, "Khaju khan & Gulsan khan");
    str[5] = new family("Jaitun khan", 45, "Khaju khan & Gulsan khan");
    str[6] = new family("Hameed khan", 60, "Khaju khan & Gulsan khan");
    str[7] = new family("Tajbi khan", 48, "Khaju khan & Gulsan khan");
    str[8] = new family("Anwar khan", 51, "Khaju khan & Gulsan khan");
    str[9] = new family("Rehnuma khan", 42, "Khaju khan & Gulsan khan");
    str[10] = new family("Shahin khan", 31, "Hamje khan & Anaad khan");
    str[11] = new family("Firoz khan", 34, "Hamje khan & Anaad khan");
    str[12] = new family("Aman khan", 20, "Babu Khan & Jaitun khan");
    str[13] = new family("Arshan khan", 19, "Babu Khan & Jaitun khan");
    str[14] = new family("Arshi khan", 18, "Babu Khan & Jaitun khan");
    str[15] = new family("Mashid khan", 18, "Anwar khan & Rehnuma");
    str[16] = new family("Alshifa khan", 17, "Anwar khan & Rehnuma");
    str[17] = new family("Nazma khan", 35, "Hameed khan & Tajbi khan");
    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Generation of Family ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
    System.out.print("\t\t\t\t\t\t " + str[0].name); // khaju
    System.out.println( str[1].name);
    System.out.print("\t\t\t\t\t\t\t |\n");
    System.out.print("\t\t\t\t\t\t\t |\n");
    System.out.print("\t\t _______________________________________________________________________________________________\n");
    System.out.print("\t\t|\t\t\t    |\t\t\t\t|\t\t\t\t\t|\n");
    System.out.print("\t\t|\t\t\t    |\t\t\t\t|\t\t\t\t\t|\n");
    System.out.print("   " + str[2].name); // hamje
    System.out.print(" & " + str[3].name);
    System.out.print("\t" + str[4].name); // babu
    System.out.print(" & " + str[5].name);
    System.out.print("\t\t" + str[6].name); // hameed
    System.out.print(" & " + str[7].name);
    System.out.print("\t" + str[8].name); // anwar
    System.out.println(" & " + str[9].name);
    System.out.print("\t|\t\t\t\t   |\t\t\t\t    |\t\t\t\t\t|\n");
    System.out.print("\t|\t\t\t\t   |\t\t\t\t    |\t\t\t\t\t|\n");
    System.out.print("    ____________\t\t  ___________________\t\t\t    |\t\t\t\t      _____________\n");
    System.out.print("   |\t\t|\t\t |\t   |\t     |\t\t\t    |\t\t\t\t     |\t\t   |\n");
    System.out.print("   |\t\t|\t\t |\t   |\t     |\t\t\t    |\t\t\t\t     |\t\t   |\n");
    System.out.print(str[10].name);
    System.out.print(" " + str[11].name); // firoz
    System.out.print("\t " + str[12].name);
    System.out.print("   " + str[13].name);
    System.out.print("   " + str[14].name); // arshi
    System.out.print("\t\t" + str[17].name); // nazma
    System.out.print("\t\t\t" + str[15].name); // mas
    System.out.println("  " + str[16].name); // alsh
    System.out.print("============================================================================================================================================\n");
    for (int i = 0; i < str.length; i++) {
    str[i].display();
    }
    System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    System.out.printf("|\tAscending order(age) \t  |\n");
    System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    family temp;
    for (int i = 0; i <= 17; i++) {
      for (int j = i + 1; j <= 17; j++) {
        if (str[i].age > str[j].age) {
          temp = str[i];
          str[i] = str[j];
          str[j] = temp;
        }
      }
      System.out.printf(str[i].name + "\t:\t" + str[i].age + "\n");
    }
    System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    System.out.printf("|\tDescending order(age) \t  |\n");
    System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    for (int i = 0; i <= 17; i++) {
      for (int j = i + 1; j <= 17; j++) {
        if (str[i].age < str[j].age) {
          temp = str[i];
          str[i] = str[j];
          str[j] = temp;
  }
      }
      System.out.print(str[i].name + "\t:\t" + str[i].age + "\n");
    }
    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    System.out.print("|\tSearch the Name\t\t  |\n");
    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    int c = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Search the Name = ");
    String n = sc.nextLine();
    for (int i = 0; i <= 17; i++) {
      if (str[i].name.equals(n)) {
        System.out.println("~\tName\t:\t" + str[i].name + "\n~\tAge\t:\t" + str[i].age);
        System.out.print("~\tParents\t:\t" + str[i].parents);
        c++;
        break; }
    }
    if (c==0) {
      System.out.print("~    This member is not available this family");  }
  }
}
