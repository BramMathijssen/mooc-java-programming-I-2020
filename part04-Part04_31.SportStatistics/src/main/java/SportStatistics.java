
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matchesPlayed =0;
        int wins =0;
        int losses =0;
        
        System.out.println("File: ");
        String file = scanner.nextLine();
        
        System.out.println("Team: ");
        String teamName = scanner.nextLine();
        
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String row = fileReader.nextLine();
                
                String[]parts = row.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);
                
                if(teamName.equals(homeTeam)||teamName.equals(awayTeam)){
                    if(teamName.equals(homeTeam)){
                        if(homePoints > awayPoints){
                            wins++;
                        }else{
                            losses++;
                        }
                    } else if(teamName.equals(awayTeam)){
                        if(awayPoints > homePoints){
                            wins++;
                        }else{
                            losses++;
                        }
                    }
                    matchesPlayed++;
                }
                
            }
            
        }catch(Exception e){
            System.out.println("ERROR");
        }
        
        System.out.println("Games: " +matchesPlayed);
        System.out.println("Wins: " +wins);
        System.out.println("Losses: " +losses);
        

    }

}
