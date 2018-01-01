
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Welcome {

    public JPanel Main;
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JButton addButton;
    private JButton removeButton;
    private JList list1;
    private JTextField TableNumberIn;
    private JTextField NameIn;
    private JButton addPersonButton;
    private JButton clearTableButton;
    private JList list2;
    private JList list3;
    private JList list4;
    private JList list5;
    private JList list6;
    private JList list7;
    private JCheckBox saladCheckBox;
    private JCheckBox wingsCheckBox;
    private JCheckBox icedTeaCheckBox;
    private JCheckBox coffeeCheckBox;
    private JCheckBox soupCheckBox;
    private JList list10;
    private JList list13;
    private JList list8;
    private JList list9;
    private JCheckBox chickenCheckBox;
    private JCheckBox iceCreamCheckBox;
    private JCheckBox pepsiCheckBox;
    private JCheckBox pastaCheckBox;
    private JCheckBox pieCheckBox;
    private JCheckBox cakeCheckBox;
    private JCheckBox steakCheckBox;
    private JList list11;
    private JList list12;
    private JTextField TableInput2;
    private JButton addOrderToTableButton;
    private JButton generateBillButton;
    private JLabel BillTotal;
    private JTextField TicketInput;
    private JButton addCoatButton;
    private JButton removeCoatButton;
    private JButton checkCoatButton;
    private JList list14;
    private JLabel reservationResult;
    private JButton addToInventoryButton;
    private JTextField InventoryIN;
    int Spot;
    String SpotInput1;
    String[] anArray;


    //Tables
    ArrayList<String> table1 = new ArrayList<String>(); // added ()
    ArrayList<String> table2 = new ArrayList<String>(); // added ()
    ArrayList<String> table3 = new ArrayList<String>(); // added ()
    ArrayList<String> table4 = new ArrayList<String>(); // added ()
    ArrayList<String> table5 = new ArrayList<String>(); // added ()
    ArrayList<String> table6 = new ArrayList<String>(); // added ()

    //Orders
    Queue <String> table1Food =  new LinkedList <String> ();
    Queue <String> table2Food =  new LinkedList <String> ();
    Queue <String> table3Food =  new LinkedList <String> ();
    Queue <String> table4Food =  new LinkedList <String> ();
    Queue <String> table5Food =  new LinkedList <String> ();
    Queue <String> table6Food =  new LinkedList <String> ();

    //Bill
 Double Table1Bill =0.00;
 Double Table2Bill = 0.00;
 Double Table3Bill = 0.00;
 Double Table4Bill = 0.00;
 Double Table5Bill = 0.00;
 Double Table6Bill = 0.00;

//Coat Check
int[] TicketNum = new int[15];
ArrayList<String> OutputTicket = new ArrayList<String>(); // added ()

    public Welcome() {


    BST bst = new BST();


        anArray = new String[16];

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    SpotInput1 = textField1.getText();
                    Spot = Integer.parseInt(SpotInput1);
                    if(Spot <16) {
                        anArray[Spot] = Spot + ":" + "Taken";
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Error Spot doesn't exist");

                    }
                    list1.setListData(anArray);

            }
        });
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SpotInput1 = textField1.getText();
                Spot = Integer.parseInt(SpotInput1);

                if(Spot <16) {
                    anArray[Spot] = null;
                }
                else {
                    JOptionPane.showMessageDialog(null, "Error Spot doesn't exist");
                }
                list1.setListData(anArray);
            }
        });

    //END OF PARKING



    //START OF TABLES

        addPersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String TableNumber = TableNumberIn.getText();
                int TableNum = Integer.parseInt(TableNumber);
                String Name = NameIn.getText();
               if (TableNum == 1 && table1.size() < 5) {
                   table1.add(Name);
               }
               else if(TableNum == 2 && table2.size() < 5) {
                   table2.add(Name);
               }
               else if(TableNum == 3 && table3.size() < 5) {
                   table3.add(Name);
               }
               else if (TableNum == 4 && table4.size() < 5) {
                   table4.add(Name);
               }
               else if (TableNum == 5 && table5.size() < 5) {
                   table5.add(Name);
               }
               else if(TableNum == 6 && table6.size() < 5) {
                   table6.add(Name);
               }



               list2.setListData(table1.toArray());
               list3.setListData(table2.toArray());
               list4.setListData(table3.toArray());
               list5.setListData(table4.toArray());
               list6.setListData(table5.toArray());
               list7.setListData(table6.toArray());




            }
        });


        clearTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String TableNumber = TableNumberIn.getText();
                int TableNum = Integer.parseInt(TableNumber);

                if (TableNum == 1) {
                    table1.clear();
                    table1Food.clear();
                    Table1Bill = 0.00;
                }
                else if(TableNum == 2) {
                    table2.clear();
                    table2Food.clear();
                    Table2Bill = 0.00;
                }
                else if(TableNum == 3) {
                    table3.clear();
                    table3Food.clear();
                    Table3Bill = 0.00;
                }
                else if (TableNum == 4 ) {
                    table4.clear();
                    table4Food.clear();
                    Table4Bill = 0.00;
                }
                else if (TableNum == 5) {
                    table5.clear();
                    table5Food.clear();
                    Table5Bill = 0.00;
                }
                else if(TableNum == 6) {
                    table6.clear();
                    table6Food.clear();
                    Table6Bill = 0.00;
                }

                list2.setListData(table1.toArray());
                list3.setListData(table2.toArray());
                list4.setListData(table3.toArray());
                list5.setListData(table4.toArray());
                list6.setListData(table5.toArray());
                list7.setListData(table6.toArray());
                list8.setListData(table1Food.toArray());
                list9.setListData(table2Food.toArray());
                list11.setListData(table3Food.toArray());
                list13.setListData(table4Food.toArray());
                list10.setListData(table5Food.toArray());
                list12.setListData(table6Food.toArray());

            }
        });


        //END OF TABLES

        //START OF ORDER

        addOrderToTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String TableNumber2 = TableInput2.getText();
                int TableNum2 = Integer.parseInt(TableNumber2);


                if(saladCheckBox.isSelected()) {
                    if (TableNum2 == 1) {
                        table1Food.add("Salad");
                        Table1Bill += 8;
                    }
                    else if(TableNum2 == 2) {
                        table2Food.add("Salad");
                        Table2Bill += 8;
                    }
                    else if(TableNum2 == 3) {
                        table3Food.add("Salad");
                        Table3Bill += 8;
                    }
                    else if (TableNum2 == 4) {
                        table4Food.add("Salad");
                        Table4Bill += 8;
                    }
                    else if (TableNum2 == 5) {
                        table5Food.add("Salad");
                        Table5Bill += 8;
                    }
                    else if(TableNum2 == 6) {
                        table6Food.add("Salad");
                        Table6Bill += 8;
                    }

                }
                 if (wingsCheckBox.isSelected()) {
                    if (TableNum2 == 1) {
                        table1Food.add("Wings");
                        Table1Bill += 12;
                    }
                    else if(TableNum2 == 2) {
                        table2Food.add("Wings");
                        Table2Bill += 12;
                    }
                    else if(TableNum2 == 3) {
                        table3Food.add("Wings");
                        Table3Bill += 12;
                    }
                    else if (TableNum2 == 4) {
                        table4Food.add("Wings");
                        Table4Bill += 12;
                    }
                    else if (TableNum2 == 5) {
                        table5Food.add("Wings");
                        Table5Bill += 12;
                    }
                    else if(TableNum2 == 6) {
                        table6Food.add("Wings");
                        Table6Bill += 12;
                    }
                }
                 if (soupCheckBox.isSelected()) {

                    if (TableNum2 == 1){
                        table1Food.add("Soup");
                        Table1Bill += 6;
                    }
                    else if(TableNum2 == 2) {
                        table2Food.add("Soup");
                        Table2Bill += 6;
                    }
                    else if(TableNum2 == 3) {
                        table3Food.add("Soup");
                        Table3Bill += 6;
                    }
                    else if (TableNum2 == 4) {
                        table4Food.add("Soup");
                        Table4Bill += 6;
                    }

                    else if (TableNum2 == 5) {
                        table5Food.add("Soup");
                        Table5Bill += 6;
                    }
                    else if(TableNum2 == 6) {
                        table6Food.add("Soup");
                        Table6Bill += 6;
                    }
                }
                 if (icedTeaCheckBox.isSelected()) {
                    if (TableNum2 == 1) {
                        table1Food.add("Iced Tea");
                        Table1Bill += 2.50;
                    }
                    else if(TableNum2 == 2) {
                        table2Food.add("Iced Tea");
                        Table2Bill += 2.50;
                    }
                    else if(TableNum2 == 3) {
                        table3Food.add("Iced Tea");
                        Table3Bill += 2.50;
                    }
                    else if (TableNum2 == 4) {
                        table4Food.add("Iced Tea");
                        Table4Bill += 2.50;
                    }
                    else if (TableNum2 == 5) {
                        table5Food.add("Iced Tea");
                        Table5Bill += 2.50;
                    }
                    else if(TableNum2 == 6) {
                        table6Food.add("Iced Tea");
                        Table6Bill += 2.50;
                    }
                }
                 if (coffeeCheckBox.isSelected()) {

                    if (TableNum2 == 1) {
                        table1Food.add("Coffee");
                        Table1Bill += 2.50;
                    }
                    else if(TableNum2 == 2) {
                        table2Food.add("Coffee");
                        Table2Bill += 2.50;
                    }
                    else if(TableNum2 == 3) {
                        table3Food.add("Coffee");
                        Table3Bill += 2.50;
                    }
                    else if (TableNum2 == 4) {
                        table4Food.add("Coffee");
                        Table4Bill += 2.50;
                    }
                    else if (TableNum2 == 5) {
                        table5Food.add("Coffee");
                        Table5Bill += 2.50;
                    }
                    else if(TableNum2 == 6) {
                        table6Food.add("Coffee");
                        Table6Bill += 2.50;
                    }
                }
                 if (pepsiCheckBox.isSelected()) {
                    if (TableNum2 == 1) {
                        table1Food.add("Pepsi");
                        Table1Bill += 2.50;
                    }
                    else if(TableNum2 == 2) {
                        table2Food.add("Pepsi");
                        Table2Bill += 2.50;
                    }
                    else if(TableNum2 == 3) {
                        table3Food.add("Pepsi");
                        Table3Bill += 2.50;
                    }
                    else if (TableNum2 == 4) {
                        table4Food.add("Pepsi");
                        Table4Bill += 2.50;
                    }
                    else if (TableNum2 == 5) {
                        table5Food.add("Pepsi");
                        Table5Bill += 2.50;
                    }
                    else if(TableNum2 == 6) {
                        table6Food.add("Pepsi");
                        Table6Bill += 2.50;
                    }

                }
                 if(chickenCheckBox.isSelected()) {

                    if (TableNum2 == 1) {
                        table1Food.add("Chicken");
                        Table1Bill += 15.50;
                    }
                    else if(TableNum2 == 2) {
                        table2Food.add("Chicken");
                        Table2Bill += 15.50;
                    }
                    else if(TableNum2 == 3) {
                        table3Food.add("Chicken");
                        Table3Bill += 15.50;
                    }
                    else if (TableNum2 == 4) {
                        table4Food.add("Chicken");
                        Table4Bill += 15.50;
                    }
                    else if (TableNum2 == 5) {
                        table5Food.add("Chicken");
                        Table5Bill += 15.50;
                    }
                    else if(TableNum2 == 6) {
                        table6Food.add("Chicken");
                        Table6Bill += 15.50;
                    }
                }
                 if(pastaCheckBox.isSelected()) {

                    if (TableNum2 == 1) {
                        table1Food.add("Pasta");
                        Table1Bill += 13.50;
                    }
                    else if(TableNum2 == 2) {
                        table2Food.add("Pasta");
                        Table2Bill += 13.50;
                    }
                    else if(TableNum2 == 3) {
                        table3Food.add("Pasta");
                        Table3Bill += 13.50;
                    }
                    else if (TableNum2 == 4) {
                        table4Food.add("Pasta");
                        Table4Bill += 13.50;
                    }
                    else if (TableNum2 == 5) {
                        table5Food.add("Pasta");
                        Table5Bill += 13.50;
                    }
                    else if(TableNum2 == 6) {
                        table6Food.add("Pasta");
                        Table6Bill += 13.50;
                    }
                }
                if(steakCheckBox.isSelected()) {
                    if (TableNum2 == 1) {
                        table1Food.add("Steak");
                        Table1Bill += 35.50;
                    }
                    else if(TableNum2 == 2) {
                        table2Food.add("Steak");
                        Table2Bill += 35.50;
                    }
                    else if(TableNum2 == 3) {
                        table3Food.add("Steak");
                        Table3Bill += 35.50;
                    }
                    else if (TableNum2 == 4) {
                        table4Food.add("Steak");
                        Table4Bill += 35.50;
                    }
                    else if (TableNum2 == 5) {
                        table5Food.add("Steak");
                        Table5Bill += 35.50;
                    }
                    else if(TableNum2 == 6) {
                        table6Food.add("Steak");
                        Table6Bill += 35.50;
                    }

                }
                 if(iceCreamCheckBox.isSelected()) {
                    if (TableNum2 == 1) {
                        table1Food.add("Ice Cream");
                        Table1Bill += 5.00;
                    }
                    else if(TableNum2 == 2) {
                        table2Food.add("Ice Cream");
                        Table2Bill += 5.00;
                    }
                    else if(TableNum2 == 3) {
                        table3Food.add("Ice Cream");
                        Table3Bill += 5.00;
                    }
                    else if (TableNum2 == 4) {
                        table4Food.add("Ice Cream");
                        Table4Bill += 5.00;
                    }
                    else if (TableNum2 == 5) {
                        table5Food.add("Ice Cream");
                        Table5Bill += 5.00;
                    }
                    else if(TableNum2 == 6) {
                        table6Food.add("Ice Cream");
                        Table6Bill += 5.00;
                    }

                }
                 if (pieCheckBox.isSelected()) {

                    if (TableNum2 == 1) {
                        table1Food.add("Pie");
                        Table1Bill += 5.00;
                    }
                    else if(TableNum2 == 2) {
                        table2Food.add("Pie");
                        Table2Bill += 5.00;
                    }
                    else if(TableNum2 == 3) {
                        table3Food.add("Pie");
                        Table3Bill += 5.00;
                    }
                    else if (TableNum2 == 4) {
                        table4Food.add("Pie");
                        Table4Bill += 5.00;
                    }
                    else if (TableNum2 == 5) {
                        table5Food.add("Pie");
                        Table5Bill += 5.00;
                    }
                    else if(TableNum2 == 6) {
                        table6Food.add("Pie");
                        Table6Bill += 5.00;

                    }
                }
                 if (cakeCheckBox.isSelected()) {

                    if (TableNum2 == 1) {
                        table1Food.add("Cake");
                        Table1Bill += 5.00;
                    }
                    else if(TableNum2 == 2) {
                        table2Food.add("Cake");
                        Table2Bill += 5.00;
                    }
                    else if(TableNum2 == 3) {
                        table3Food.add("Cake");
                        Table3Bill += 5.00;
                    }
                    else if (TableNum2 == 4) {
                        table4Food.add("Cake");
                        Table4Bill += 5.00;
                    }
                    else if (TableNum2 == 5) {
                        table5Food.add("Cake");
                        Table5Bill += 5.00;
                    }
                    else if(TableNum2 == 6) {
                        table6Food.add("Cake");
                        Table6Bill += 5.00;
                    }
                }
                list8.setListData(table1Food.toArray());
                list9.setListData(table2Food.toArray());
                list11.setListData(table3Food.toArray());
                list13.setListData(table4Food.toArray());
                list10.setListData(table5Food.toArray());
                list12.setListData(table6Food.toArray());

            }
        });

        generateBillButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String TableNumber2 = TableInput2.getText();
             int TableNum2 = Integer.parseInt(TableNumber2);
                double Bill = 0;
                if (TableNum2 == 1) {
                    BillTotal.setText("$" + Table1Bill.toString());
                }
                else if (TableNum2 == 2){
                    BillTotal.setText("$" + Table2Bill.toString());
                }
                else if(TableNum2 == 3) {
                    BillTotal.setText("$" + Table3Bill.toString());
                }
                else if(TableNum2 == 4) {
                    BillTotal.setText("$" + Table4Bill.toString());
                }
                else if(TableNum2 == 5) {
                    BillTotal.setText("$" + Table5Bill.toString());
                }
                else if (TableNum2 == 6) {
                    BillTotal.setText("$" + Table6Bill.toString());
                }

            }
        });

        //END OF ORDER

        //START OF RESERVATIONS


        addCoatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Ticket = Integer.parseInt(TicketInput.getText());
                TicketNum[Ticket] = Ticket;
                bst.insert((Ticket));
                bst.inorder();
                JOptionPane.showMessageDialog(null,"Coat with Ticket #" + Ticket + " added to system.");

                int[] sortedArray = bubbleSort(TicketNum);
                Stack<Integer> Inventory = new Stack<Integer>();
                for (int x =0; x<sortedArray.length;x++) {
                    if( x!= 0 ){
                    Inventory.add(sortedArray[x]);
                    }
                }


                list14.setListData(Inventory);

            }
        });


        removeCoatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Ticket = Integer.parseInt(TicketInput.getText());
               for(int x =0; x <TicketNum.length; x++){
                   if(TicketNum[x] == Ticket) {
                       TicketNum[x] = 0;
                   }
               }


                bst.delete((Ticket));
                bst.inorder();
                int[] sortedArray = bubbleSort(TicketNum);

                Stack<Integer> Inventory = new Stack<Integer>();
                for (int x =0; x<sortedArray.length;x++) {
                    if( x!= 0 ){
                        Inventory.add(sortedArray[x]);
                    }
                }

                list14.setListData(Inventory);
            }
        });


        checkCoatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int Ticket = Integer.parseInt(TicketInput.getText());
                bst.search(Ticket);
                bst.inorder();
            }
        });


    }




    static int[] bubbleSort(int[] numbers) {
            int n = numbers.length;

            for(int pass = 1; pass <= n; pass++) {
                for (int current = 0; current < n-pass; current++) {
                    if (numbers[current] > numbers[current+1]) {

                        int temp = numbers[current];
                        numbers[current] = numbers[current +1];
                        numbers[current+1] = temp;
                    }
                }
            }
            return numbers;
        }

    class BSTNode
    {
        BSTNode left, right;
        int data;
        /* Constructor */
        public BSTNode()
        {
            left = null;
            right = null;
            data = 0;
        }
        /* Constructor */
        public BSTNode(int n)
        {
            left = null;
            right = null;
            data = n;
        }
        /* Function to set left node */
        public void setLeft(BSTNode n)
        {
            left = n;
        }
        /* Function to set right node */
        public void setRight(BSTNode n)
        {
            right = n;
        }
        /* Function to get left node */
        public BSTNode getLeft()
        {
            return left;
        }
        /* Function to get right node */
        public BSTNode getRight()
        {
            return right;
        }
        /* Function to set data to node */
        public void setData(int d)
        {
            data = d;
        }
        /* Function to get data from node */
        public int getData()
        {
            return data;
        }
    }

    /* Class BST */
    class BST
    {
        private BSTNode root;

        /* Constructor */
        public BST()
        {
            root = null;
        }
        /* Function to check if tree is empty */
        public boolean isEmpty()
        {
            return root == null;
        }
        /* Functions to insert data */
        public void insert(int data)
        {
            root = insert(root, data);
        }
        /* Function to insert data recursively */
        private BSTNode insert(BSTNode node, int data)
        {
            if (node == null)
                node = new BSTNode(data);
            else
            {
                if (data <= node.getData())
                    node.left = insert(node.left, data);
                else
                    node.right = insert(node.right, data);
            }
            return node;
        }
        /* Functions to delete data */
        public void delete(int k)
        {
            if (isEmpty())
                JOptionPane.showMessageDialog(null,"There are no coats checked.");
            else if (search(k) == false)
                JOptionPane.showMessageDialog(null, "Sorry, but the ticket #"+ k +" does not exist.");
            else
            {
                root = delete(root, k);
                JOptionPane.showMessageDialog(null,"Coat with ticket #" + k + " has been returned.");

            }
        }
        private BSTNode delete(BSTNode root, int k)
        {
            BSTNode p, p2, n;
            if (root.getData() == k)
            {
                BSTNode lt, rt;
                lt = root.getLeft();
                rt = root.getRight();
                if (lt == null && rt == null)
                    return null;
                else if (lt == null)
                {
                    p = rt;
                    return p;
                }
                else if (rt == null)
                {
                    p = lt;
                    return p;
                }
                else
                {
                    p2 = rt;
                    p = rt;
                    while (p.getLeft() != null)
                        p = p.getLeft();
                    p.setLeft(lt);
                    return p2;
                }
            }
            if (k < root.getData())
            {
                n = delete(root.getLeft(), k);
                root.setLeft(n);
            }
            else
            {
                n = delete(root.getRight(), k);
                root.setRight(n);
            }
            return root;
        }
        /* Functions to count number of nodes */
        public boolean search(int val)
        {
            return search(root, val);
        } //Searches element
        private boolean search(BSTNode r, int val)
        {
            boolean found = false;
            while ((r != null) && !found)
            {
                int rval = r.getData();
                if (val < rval)
                    r = r.getLeft();
                else if (val > rval)
                    r = r.getRight();
                else
                {
                    found = true;
                    break;
                }
                found = search(r, val);
            }


            if (found) {
                JOptionPane.showMessageDialog(null,"Ticket number was found in the system.");
            }
            return found;
        }
        /* Function for inorder traversal */
        public void inorder()
        {
            inorder(root);
        }
        private void inorder(BSTNode r)
        {
            if (r != null)
            {
                inorder(r.getLeft());
              //System.out.print(r.getData() +" ")
                inorder(r.getRight());
            }
        }
    }
}


