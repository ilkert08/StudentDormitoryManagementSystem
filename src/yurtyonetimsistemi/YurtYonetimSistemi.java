package yurtyonetimsistemi;

import java.sql.Connection;


public class YurtYonetimSistemi {

    static Connection con;

    public static void main(String[] args) {     
        mysqlConnector msql = new mysqlConnector();
        con = msql.connectorSender();
        yeniEkran ekran1 = new yeniEkran();
        ekran1.setLocation(300,300);
        ekran1.setResizable(false);
        ekran1.setVisible(true); 
        

    }

}


/*      mysqlConnector msql = new mysqlConnector();
        con = msql.connectorSender();

       //SORGU
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from students");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2)+"  " +rs.getString(3));
            }


        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Kaldi");
        }
        ///SORGU*/

        
        /* //UPDATE  
        try{
            Statement stmt=con.createStatement(); 
            String sorgu=String.format("insert into people values('%d', '%s')",no, ad);
            int ekleme = stmt.executeUpdate(sorgu);
            System.out.println("Kayıt Eklendi");
        }catch(Exception e){ System.out.println(e);}
         */ ///UPDATE
         
         
        /* // INSERT INTO
            try{
            Statement stmt=con.createStatement(); 
            String sorgu=String.format("insert into people values('%d', '%s')",no, ad);
            int ekleme = stmt.executeUpdate(sorgu);
            System.out.println("Kayıt Eklendi");
        }catch(Exception e){ System.out.println(e);}
   
         */ //INSERT INTO
