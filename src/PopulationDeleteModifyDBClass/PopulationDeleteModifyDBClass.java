package PopulationDeleteModifyDBClass;


public class PopulationDeleteModifyDBClass
{

    public static void main(String[] args)
    {
        //For connecting to database.
       String dbDirectory = "E:/CIS2206 - Business Programming I/";
       String dbName = "PopulationDB2";
       
       
       int TownNumberIn = 19;
       String townName = "Pitt";
       
       //Connects to database.
       PopulationDatabaseOperations.setConnection(dbDirectory, dbName);
    
       Town town = PopulationDatabaseOperations.retrieveTown(TownNumberIn);       
//       //Prints the towns
       printTown(town);
//       
//       Modifies a town
       PopulationDatabaseOperations.modifyTownName(TownNumberIn, townName);
//       Retrieves town after query executed. 
       town = PopulationDatabaseOperations.retrieveTown(TownNumberIn);
//       //Prints towns.
       printTown(town);
       
        System.out.println("DATABASE COMPLETE");
       
        
    }
    
    static void printTown(Town town)
    {
        
            System.out.println(town.getTownNumber());
            System.out.println(town.getTownName());
            System.out.println(town.getCountyNumber());
            System.out.println(town.getRegionNumber());
            System.out.println(town.getPopulation());
            System.out.println();
        
    
    }
}
