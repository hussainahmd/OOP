//Hussain Ahmad
//SP22-BCS-067
public class Inherit
{
    public static void main(String[] args) 
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("\nAoA, Welcome to the Inheritance Calculator");

        System.out.print("\nPlease enter the value of Inheritance : ");
        double inherit = input.nextDouble();

        System.out.print("What is the value of loan, if any : ");
        double loan = input.nextDouble();

        //double son, daughter, father, mother, left, left2, left3, left4;
        
        if(loan < inherit)
        {
            System.out.print("If the deceased has left any will enter the value of the will : ");
            double will = input.nextDouble();

            double newInherit = inherit - loan;
            newInherit = 2.0 / 3.0 * newInherit;

            if(will < (1.0 / 3.0 * inherit)) {
                newInherit = newInherit + ((1.0 / 3.0 * inherit) - will);
            }

            System.out.printf("The divisible value of inheritance is : %.2f%n", newInherit);

            System.out.print("How many sons does the deceased have? : ");
            int rSon = input.nextInt();

            System.out.print("How many daughters does the deceased have? : ");
            int rDaughter = input.nextInt();

            System.out.print("Is mother of the deceased alive or not? if alive enter 1 else 0 : ");
            int rMother = input.nextInt();

            System.out.print("Is father of the deceased alive or not? if alive enter 1 else 0 : ");
            int rFather = input.nextInt();

            System.out.print("Does the deceased has any sbiling or not? if has enter 1 else 0 : ");
            int rSibling = input.nextInt();

            double son = 0; double daughter = 0; double father = 0; double mother = 0; double left = 0; double left2 = 0;

            //only son(s) AND daughter(s) alive
            if(rSon > 0 && rDaughter > 0 && rFather == 0 && rMother == 0)
            {
                son = 2 / 3.0 * newInherit;
                daughter = 1 / 3.0 * newInherit;
            }

            //if both type of children alive AND either one OR both parents alive
            if((rSon > 0 && rDaughter > 0) && (rFather == 1 || rMother == 1))
            {   
                if(rFather == 1 && rMother != 1){
                    father = 1 / 6.0 * newInherit;
                    left = 5 / 6.0 * newInherit;

                    son = 2 / 3.0 * left;
                    daughter = 1 / 3.0 * left;
                }
                if(rMother == 1 && rFather != 1){
                    mother = 1 / 6.0 * newInherit;
                    left = 5 / 6.0 * newInherit;

                    son = 2 / 3.0 * left;
                    daughter = 1 / 3.0 * left;
                }
                if(rMother == 1 && rFather == 1){
                    mother = 1 / 6.0 * newInherit;
                    father = 1 / 6.0 * newInherit;
                    left = 4 / 6.0 * newInherit;

                    son = 2 / 3.0 * left;
                    daughter = 1 / 3.0 * left;
                }

            }

            //if only daughter"s" alive AND either one OR both parents alive
            if((rSon == 0 && rDaughter > 0) && (rFather == 1 || rMother == 1))
            {   
                //if only 1 daughter and either one OR both parents alive
                if(rFather == 1 && rDaughter == 1){
                    daughter = 1 / 2.0 * newInherit;
                    left2 = 1 / 2.0 * newInherit;
                    father = left2;
                }
                if(rMother == 1 && rDaughter == 1){
                    daughter = 1 / 2.0 * newInherit;
                    left2 = 1 / 2.0 * newInherit;
                    mother = left2;
                }
                if(rMother == 1 && rFather == 1 && rDaughter == 1){
                    daughter = 1 / 2.0 * newInherit;
                    left2 = 1 / 2.0 * newInherit;
                    father = 1 / 2.0 * left2;
                    mother = 1 / 2.0 * left2;
                }
                ////if >= 2 daughters and either one OR both parents alive
                if(rFather == 1 && rDaughter >= 2){
                    daughter = 1 / 3.0 * newInherit;
                    left2 = 1 / 3.0 * newInherit;
                    father = left2;
                }
                if(rMother == 1 && rDaughter >= 2){
                    daughter = 1 / 3.0 * newInherit;
                    left2 = 1 / 3.0 * newInherit;
                    mother = left2;
                }
                if(rMother == 1 && rFather == 1 && rDaughter >= 2){
                    daughter = 1 / 3.0 * newInherit;
                    left2 = 1 / 3.0 * newInherit;
                    father = 1 / 2.0 * left2;
                    mother = 1 / 2.0 * left2;
                }

            }
            
            //only son alive
            if(rSon > 0 && rDaughter == 0 && rFather == 0 && rMother == 0){
                son = newInherit;
            }

            //only daughter alive
            if(rSon == 0 && rDaughter > 0 && rFather == 0 && rMother == 0){
                daughter = newInherit;
            }

            //only father alive
            if(rSon == 0 && rDaughter == 0 && rFather == 1 && rMother == 0){
                father = newInherit;
            }

            //only mother alive
            if(rSon == 0 && rDaughter == 0 && rFather == 0 && rMother == 1){
                daughter = newInherit;
            }

            //only both parents alive (no sibling)
            if(rSon == 0 && rDaughter == 0 && rFather == 1 && rMother == 1 && rSibling == 0){
                mother = 1 / 3.0 * newInherit;
                father = 2 / 3.0 * newInherit;
            }

            //only both parents alive with sibling(s) also there
            if(rSon == 0 && rDaughter == 0 && rFather == 1 && rMother == 1 && rSibling == 1){
                mother = 1 / 6.0 * newInherit;
                father = 5 / 6.0 * newInherit;
            }

            System.out.printf("%nThe share of father is : %.2f%n", father);
            System.out.printf("The share of mother is : %.2f%n", mother);
            System.out.printf("The share for a son is : %.2f%n", son / rSon);
            System.out.printf("The share for a daughter is : %.2f%n", daughter / rDaughter);
        }
        else
        {
            System.out.print("The divisible value of inheritance is : 0");
        }

    }
}