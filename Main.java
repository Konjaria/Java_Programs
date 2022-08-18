import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

abstract class Cv_template{
    public String owner_name, owner_Surname;
    public void setOwner_Surname(String owner_Surname) {
        this.owner_Surname = owner_Surname;
    }
    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }
    abstract void printInfo();
    
    abstract void printInfo(FileWriter Moses_Writer);
}

class Education extends Cv_template{
    String Study_Program,Institution_Place_of_education, from_to, City_Country_GPA;
    boolean present_, if_wants_to_add_educational_skills;
    ArrayList<String> Courses_and_Subjectives = new ArrayList<String>();
    public void setIf_wants_to_add_educational_skills(boolean if_wants_to_add_educational_skills) {
        this.if_wants_to_add_educational_skills = if_wants_to_add_educational_skills;
    }
    public void setCity_Country_GPA(String city_Country_GPA) {
        City_Country_GPA = city_Country_GPA;
    }
    public void setCourses_and_Subjectives(ArrayList<String> courses_and_Subjectives) {
        Courses_and_Subjectives = courses_and_Subjectives;
    }
    public void setFrom_to(String from_to) {
        this.from_to = from_to;
    }
    public void setInstitution_Place_of_education(String institution_Place_of_education) {
        Institution_Place_of_education = institution_Place_of_education;
    }
    public void setPresent_(boolean present_) {
        this.present_ = present_;
    }
    public void setStudy_Program(String study_Program) {
        Study_Program = study_Program;
    }
    @Override
    void printInfo() {
        // TODO Auto-generated method stub
        if(this.if_wants_to_add_educational_skills)
        {    
            // System.out.println("**************   Education   **************");
            System.out.println("Study Program: " + this.Study_Program);
            System.out.println("Institution/Place of education: " + this.Institution_Place_of_education + ", " + this.City_Country_GPA);
            System.out.println(this.from_to.toLowerCase());}

    }
    @Override
    void printInfo(FileWriter Moses_Writer) {
        try{ Moses_Writer.write("\nStudy Program: " + this.Study_Program);
        Moses_Writer.write("\nInstitution/Place of education: " + this.Institution_Place_of_education + ", " + this.City_Country_GPA+"\n");
        Moses_Writer.write("\n" + this.from_to.toLowerCase());
        } 
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

class About_me extends Cv_template{
    public String  mail_account,phone_number,address, article_about_me, birth_date;
    public ArrayList<String> Web_sites = new ArrayList<String>();
    public boolean wanna_add_address, web_sites_approved, article_approve;

    public void setArticle_approve(boolean article_approve) {
        this.article_approve = article_approve;
    }

    public void setWeb_sites_approved(boolean web_sites_approved) {
        this.web_sites_approved = web_sites_approved;
    }

    public void setWanna_add_address(boolean wanna_add_address) {
        this.wanna_add_address = wanna_add_address;
    }   
    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setArticle_about_me(String article_about_me) {
        this.article_about_me = article_about_me;
    }

    public void setMail_account(String mail_account) {
        this.mail_account = mail_account;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setWeb_sites(ArrayList<String> web_sites) {
        Web_sites = web_sites;
    }

    /* (non-Javadoc)
     * @see Cv_template#printInfo()
     */
    @Override
    void printInfo() {
        System.out.println("_______             ");
        System.out.println("(  ____ \\|\\     /|");
        System.out.println("| (    \\/| )   ( | ");
        System.out.println("| |      | |   | |  ");
        System.out.println("| |      ( (   ) )  ");
        System.out.println("| |       \\ \\_/ / ");
        System.out.println("| (____/\\  \\   /  ");
        System.out.println("(_______/   \\_/    ");
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println(this.owner_name + " " +  this.owner_Surname);
        System.out.println("\n");
        if(this.article_approve){
            System.out.println(article_about_me);
        }
        System.out.println("\n");
        System.out.println("Birth date: " + this.birth_date);
        System.out.println("Mail account: " + this.mail_account); 
        System.out.println("Phone number: " + this.phone_number);
        if(this.wanna_add_address)
        {
            System.out.println("Address: " + this.address);
        }
        if(this.web_sites_approved)
        { 
            for(String item: this.Web_sites)
            {
                System.out.println(item);
            }
        }
    }

    @Override
    void printInfo(FileWriter Moses_Writer) {
       try{ Moses_Writer.write("_______         "+"\n");
        Moses_Writer.write("(  ____ \\|\\     /|"+"\n");
        Moses_Writer.write("| (    \\/| )   ( | "+"\n");
        Moses_Writer.write("| |      | |   | |  "+"\n");
        Moses_Writer.write("| |      ( (   ) )  "+"\n");
        Moses_Writer.write("| |       \\ \\_/ / "+"\n");
        Moses_Writer.write("| (____/\\  \\   /  "+"\n");
        Moses_Writer.write("(_______/   \\_/    "+"\n");
        Moses_Writer.write("\n");
        Moses_Writer.write("\n");
        Moses_Writer.write("***************************************************" +"\n");
        Moses_Writer.write(this.owner_name + " " +  this.owner_Surname +"\n");
        Moses_Writer.write("\n");
        if(this.article_approve){
            Moses_Writer.write(article_about_me +"\n");
        }
        Moses_Writer.write("\n");
        Moses_Writer.write("Birth date: " + this.birth_date +"\n");
        Moses_Writer.write("Mail account: " + this.mail_account +"\n"); 
        Moses_Writer.write("Phone number: " + this.phone_number +"\n");
        if(this.wanna_add_address)
        {
            Moses_Writer.write("Address: " + this.address +"\n");
        }
        if(this.web_sites_approved)
        { 
            for(String item: this.Web_sites)
            {
                Moses_Writer.write(item +"\n");
            }
        }
        }
        catch (IOException E ){ 
            System.out.println("An error occurred.");
            E.printStackTrace();}
        
    }

}

class Skills extends Cv_template{
    List<String> SKILLS = new ArrayList<String>();
    public void setSKILLS(List<String> sKILLS) {
        SKILLS = sKILLS;
    }
    @Override
    public void printInfo(){
       
        // System.out.println("__ _    _ _ _      ");
        // System.out.println("/ _\\ | _(_) | |___ ");
        // System.out.println("\\ \\| |/ / | | / __|");
        // System.out.println("_\\ \\   <| | | \\__ \\");
        // System.out.println("\\__/_|\\_\\_|_|_|___/");
        // System.out.println("********************");
        // System.out.println();
        int i=0;
        for(String Skill : SKILLS){
            System.out.println(Integer.toString(i) + ":  " + Skill);
            i+=1;
        }
    }
    @Override
    void printInfo(FileWriter Moses_Writer) {
        try{
            Moses_Writer.write("__ _    _ _ _       " +"\n");
            Moses_Writer.write("/ _\\ | _(_) | |___ "+"\n");
            Moses_Writer.write("\\ \\| |/ / | | / __|"+"\n");
            Moses_Writer.write("_\\ \\   <| | | \\__ \\"+"\n");
            Moses_Writer.write("\\__/_|\\_\\_|_|_|___/"+"\n");
            Moses_Writer.write("********************"+"\n");
            Moses_Writer.write("\n");
            int i=0;
            for(String Skill : SKILLS){
                Moses_Writer.write(Integer.toString(i+1) + ":  " + Skill +"\n");
                i+=1;
            }
        } 
        catch(IOException E) {            
            System.out.println("An error occurred.");
            E.printStackTrace();
        }
    }
}

class Language_Skills  extends Cv_template{
    List<String> Language_and_Proficiency;
    public void setLanguage_and_Proficiency(List<String> language_and_Proficiency) {
        Language_and_Proficiency = language_and_Proficiency;
    }
    @Override
    public void printInfo(){
       
        // System.out.println("   __                                                ");
        // System.out.println("   / /  __ _ _ __   __ _ _   _  __ _  __ _  ___  ___ ");
        // System.out.println("  / /  / _` | '_ \\ / _` | | | |/ _` |/ _` |/ _ \\/ __|");
        // System.out.println(" / /__| (_| | | | | (_| | |_| | (_| | (_| |  __/\\__ \\");
        // System.out.println(" \\____/\\__,_|_| |_|\\__, |\\__,_|\\__,_|\\__, |\\___||___/");
        // System.out.println("                   |___/             |___/           ");
        // System.out.println("*****************************************************");
        // System.out.println();
        for(String language : Language_and_Proficiency){
            System.out.println(language);
        }
    }
    @Override
    void printInfo(FileWriter Moses_Writer) {
        try{  
            Moses_Writer.write("   __                                                "+"\n");
            Moses_Writer.write("   / /  __ _ _ __   __ _ _   _  __ _  __ _  ___  ___ "+"\n");
            Moses_Writer.write("  / /  / _` | '_ \\ / _` | | | |/ _` |/ _` |/ _ \\/ __|"+"\n");
            Moses_Writer.write(" / /__| (_| | | | | (_| | |_| | (_| | (_| |  __/\\__ \\"+"\n");
            Moses_Writer.write(" \\____/\\__,_|_| |_|\\__, |\\__,_|\\__,_|\\__, |\\___||___/"+"\n");
            Moses_Writer.write("                   |___/             |___/           "+"\n");
            Moses_Writer.write("*****************************************************"+"\n");
            Moses_Writer.write("\n");
            for(String language : Language_and_Proficiency){
                Moses_Writer.write(language+"\n");
            }
        }
        catch (IOException SE){
            System.out.println("An error occurred.");
            SE.printStackTrace();
        }
    }
}

class Work_Experience  extends Cv_template{
    String Title_position, Workplace_Complany, from_to, City_country, Company_description, Contact_Info;
    ArrayList<String>Achievement_Tasks = new ArrayList<String>();
    boolean Contact_Info_approved, Company_description_is_needed, city_country_is_needed;
    public void setCity_country_is_needed(boolean city_country_is_needed) {
        this.city_country_is_needed = city_country_is_needed;
    }
    public void setCompany_description_is_needed(boolean company_description_is_needed) {
        Company_description_is_needed = company_description_is_needed;
    }
    public void setAchievement_Tasks(ArrayList<String> achievement_Tasks) {
        Achievement_Tasks = achievement_Tasks;
    }
    public void setCity_country(String city_country) {
        City_country = (this.city_country_is_needed)? city_country : "";

    }
    public void setCompany_description(String company_description) {
        Company_description = (this.Company_description_is_needed)? company_description : "";
    }
    public void setContact_Info(String contact_Info) {
        Contact_Info = (this.Contact_Info_approved)? contact_Info : "";
    }
    public void setFrom_to(String from_to) {
        this.from_to = from_to;
    }
    public void setTitle_position(String title_position) {
        Title_position = title_position;
    }
    public void setContact_Info_approved(boolean contact_Info_approved) {
        Contact_Info_approved = contact_Info_approved;
    }
    public void setWorkplace_Complany(String workplace_Complany) {
        Workplace_Complany = workplace_Complany;
    }
    @Override
    public void printInfo(){

        // System.out.println("        __          __        _      ______                      _                                   ");
        // System.out.println("        \\ \\        / /       | |    |  ____|                    (_)                                ");
        // System.out.println("         \\ \\  /\\  / /__  _ __| | __ | |__  __  ___ __   ___ _ __ _  ___ _ __   ___ ___            ");
        // System.out.println("          \\ \\/  \\/ / _ \\| '__| |/ / |  __| \\ \\/ / '_ \\ / _ \\ '__| |/ _ \\ '_ \\ / __/ _ \\   ");
        // System.out.println("           \\  /\\  / (_) | |  |   <  | |____ >  <| |_) |  __/ |  | |  __/ | | | (_|  __/            ");
        // System.out.println("            \\/  \\/ \\___/|_|  |_|\\_\\ |______/_/\\_\\ .__/ \\___|_|  |_|\\___|_| |_|\\___\\___|   ");
        // System.out.println("                                                | |                                                  ");
        // System.out.println("                                                |_|                                                  ");
        // System.out.println("******************************************************************************************");
        // System.out.println();
        System.out.println(this.Title_position);
        System.out.println(this.Workplace_Complany);
        System.out.println(this.from_to);
        if(this.city_country_is_needed)
            System.out.println(this.City_country);
        if(Company_description_is_needed)
            System.out.println(this.Company_description);
        for(String Task: this.Achievement_Tasks){
            System.out.println(Task);
        }
        if(this.Contact_Info_approved)
            System.out.println(this.Contact_Info);
    }
    @Override
    void printInfo(FileWriter Moses_Writer) {
        // Moses_Writer.write("        __          __        _      ______                      _                     ");
        // Moses_Writer.write("        \\ \\        / /       | |    |  ____|                    (_)                    ");
        // Moses_Writer.write("         \\ \\  /\\  / /__  _ __| | __ | |__  __  ___ __   ___ _ __ _  ___ _ __   ___ ___ ");
        // Moses_Writer.write("          \\ \\/  \\/ / _ \\| '__| |/ / |  __| \\ \\/ / '_ \\ / _ \\ '__| |/ _ \\ '_ \\ / __/ _ \\");
        // Moses_Writer.write("           \\  /\\  / (_) | |  |   <  | |____ >  <| |_) |  __/ |  | |  __/ | | | (_|  __/");
        // Moses_Writer.write("            \\/  \\/ \\___/|_|  |_|\\_\\ |______/_/\\_\\ .__/ \\___|_|  |_|\\___|_| |_|\\___\\___|");
        // Moses_Writer.write("                                                | |                                    ");
        // Moses_Writer.write("                                                |_|                                    ");
        // Moses_Writer.write("******************************************************************************************");
        // Moses_Writer.write();
       try{ 
            Moses_Writer.write(this.Title_position +"\n");
            Moses_Writer.write(this.Workplace_Complany+"\n");
            Moses_Writer.write(this.from_to+"\n");
            if(this.city_country_is_needed)
                Moses_Writer.write(this.City_country+"\n");
            if(Company_description_is_needed)
                Moses_Writer.write(this.Company_description+"\n");
            for(String Task: this.Achievement_Tasks){
                Moses_Writer.write(Task+"\n");
            }
            if(this.Contact_Info_approved)
                Moses_Writer.write(this.Contact_Info+"\n");
        }
        catch (IOException SE){
            System.out.println("An error occurred.");
            SE.printStackTrace();        
        }
    }
        
    }

class Organizations extends Cv_template{
    String Organization_name, From_to;
    List<String> Role = new ArrayList<String>();
    boolean Role_is_needed;
    public void setFrom_to(String from_to) {
        From_to = from_to;
    }
    public void setOrganization_name(String organization_name) {
        Organization_name = organization_name;
    }
    public void setRole(List<String> role) {
        Role = (this.Role_is_needed)? role : null;
    }
    public void setRole_is_needed(boolean role_is_needed) {
        Role_is_needed = role_is_needed;
    }
    @Override
    public void printInfo(){
        
                                                                                                                                                
        // System.out.println("_|_|                                            _|                        _|      _|                                ");
        // System.out.println("_|    _|  _|  _|_|    _|_|_|    _|_|_|  _|_|_|        _|_|_|_|    _|_|_|  _|_|_|_|        _|_|    _|_|_|      _|_|_|");  
        // System.out.println("_|    _|  _|_|      _|    _|  _|    _|  _|    _|  _|      _|    _|    _|    _|      _|  _|    _|  _|    _|  _|_|    ");  
        // System.out.println("_|    _|  _|        _|    _|  _|    _|  _|    _|  _|    _|      _|    _|    _|      _|  _|    _|  _|    _|      _|_|");  
        // System.out.println("  _|_|    _|          _|_|_|    _|_|_|  _|    _|  _|  _|_|_|_|    _|_|_|      _|_|  _|    _|_|    _|    _|  _|_|_|  ");  
        // System.out.println("                          _|                                                                                        ");  
        // System.out.println("                      _|_|                                                                                          ");
        // System.out.println("--------------------------------------------------------------------------------------------------------------------");
        // System.out.println();  
        // System.out.println();  
        System.out.println(this.Organization_name);
        System.out.println(this.From_to);
        if(Role_is_needed)
        {
            for(String role : this.Role){
                System.out.println(role);
            } 
        }
    }
    @Override
    void printInfo(FileWriter Moses_Writer) {
        try{ 
            Moses_Writer.write(this.Organization_name+"\n");
            Moses_Writer.write(this.From_to+"\n");
            if(Role_is_needed)
            {
                for(String role : this.Role){
                    Moses_Writer.write(role+"\n");
                } 
            }   
        }
        catch(IOException E) {
            System.out.println("An error occurred.");
            E.printStackTrace();
        }
    }

}

class Personal_Projects  extends Cv_template{
    String Project_Name, From_To;
    List<String> Description;

    public void setDescription(List<String> description) {
        Description = description;
    }
    public void setFrom_To(String from_To) {
        From_To = from_To;
    }
    public void setProject_Name(String project_Name) {
        Project_Name = project_Name;
    }
    @Override
    void printInfo() {
        
        // System.out.println(" ___  ___  ___   ___   __  _  _   __   __      ___  ___   __    __  ___   __  ____  ___            ");
        // System.out.println("(  ,\\(  _)(  ,) / __) /  \\( \\( ) (  ) (  )    (  ,\\(  ,) /  \\  (  )(  _) / _)(_  _)/ __)      ");
        // System.out.println(" ) _/ ) _) )  \\ \\__ \\( () ))  (  /__\\  )(__    ) _/ )  \\( () )__)(  ) _)( (_   )(  \\__ \\    ");
        // System.out.println("(_)  (___)(_)\\_)(___/ \\__/(_)\\_)(_)(_)(____)  (_)  (_)\\_)\\__/(___/ (___) \\__) (__) (___/     ");
        // System.out.println("***************************************************************************************************");
        // System.out.println();
        // System.out.println();
        System.out.println(this.Project_Name);
        System.out.println(this.From_To);
        for(String item: this.Description){
            System.out.println("- " + item);
        }
    }
    @Override
    void printInfo(FileWriter Moses_Writer) {
        try{
            // Moses_Writer.write(" ___  ___  ___   ___   __  _  _   __   __      ___  ___   __    __  ___   __  ____  ___ ");
            // Moses_Writer.write("(  ,\\(  _)(  ,) / __) /  \\( \\( ) (  ) (  )    (  ,\\(  ,) /  \\  (  )(  _) / _)(_  _)/ __)");
            // Moses_Writer.write(" ) _/ ) _) )  \\ \\__ \\( () ))  (  /__\\  )(__    ) _/ )  \\( () )__)(  ) _)( (_   )(  \\__ \\");
            // Moses_Writer.write("(_)  (___)(_)\\_)(___/ \\__/(_)\\_)(_)(_)(____)  (_)  (_)\\_)\\__/(___/ (___) \\__) (__) (___/");
            // Moses_Writer.write("***************************************************************************************************");
            // Moses_Writer.write();
            // Moses_Writer.write();
            Moses_Writer.write(this.Project_Name+"\n");
            Moses_Writer.write(this.From_To+"\n");
            for(String item: this.Description){
                Moses_Writer.write("- " + item+"\n");
            }
        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

class Certificates extends Cv_template{
    String Certificate_Name, FROM_TO, Description;
    boolean Description_is_needed;
    public void setCertificate_Name(String certificate_Name) {
        Certificate_Name = certificate_Name;
    }
    public void setDescription(String description) {
        Description = (Description_is_needed)? description : "";
    }
    public void setDescription_is_needed(boolean description_is_needed) {
        Description_is_needed = description_is_needed;
    }
    public void setFROM_TO(String fROM_TO) {
        FROM_TO = fROM_TO;
    }
    @Override
    void printInfo() {
        
        // System.out.println("  _____          _   _  __ _           _             ");
        // System.out.println("  / ____|        | | (_)/ _(_)         | |           ");
        // System.out.println(" | |     ___ _ __| |_ _| |_ _  ___ __ _| |_ ___  ___ ");
        // System.out.println(" | |    / _ \\ '__| __| |  _| |/ __/ _` | __/ _ \\/ __|");
        // System.out.println(" | |___|  __/ |  | |_| | | | | (_| (_| | ||  __/\\__ \\");
        // System.out.println("  \\_____\\___|_|   \\__|_|_| |_|\\___\\__,_|\\__\\___||___/");
        // System.out.println("********************************************************");                                                
        System.out.println(this.Certificate_Name);                                                
        System.out.println(this.FROM_TO);                                                
        if(this.Description_is_needed) {
            System.out.println(this.Description);
        }                                                      
    }
    @Override
    void printInfo(FileWriter Moses_Writer) {
        try{
            // Moses_Writer.write("  _____          _   _  __ _           _             ");
            // Moses_Writer.write("  / ____|        | | (_)/ _(_)         | |           ");
            // Moses_Writer.write(" | |     ___ _ __| |_ _| |_ _  ___ __ _| |_ ___  ___ ");
            // Moses_Writer.write(" | |    / _ \\ '__| __| |  _| |/ __/ _` | __/ _ \\/ __|");
            // Moses_Writer.write(" | |___|  __/ |  | |_| | | | | (_| (_| | ||  __/\\__ \\");
            // Moses_Writer.write("  \\_____\\___|_|   \\__|_|_| |_|\\___\\__,_|\\__\\___||___/");
            // Moses_Writer.write("********************************************************");                                                
            Moses_Writer.write(this.Certificate_Name+"\n");                                                
            Moses_Writer.write(this.FROM_TO +"\n");                                                
            if(this.Description_is_needed) {
                Moses_Writer.write(this.Description +"\n");
            }
        } catch(IOException E){
            System.out.println("An error occurred.");
            E.printStackTrace();
        }
    }
}

public class Main {

    public static String name_validation(String name){
        System.out.print(name + ": ");
        Scanner console = new Scanner(System.in);
        boolean valid = true;
        String Name = "";
        while(valid)
        {
            Name = console.nextLine();
            if(Name.length() < 2)
            {
                valid  = false;
            }
            for(int i=0;i< Name.length();i++){
                if(!valid) 
                {
                    System.err.print("Invalid " + name + " Put here again: ");
                    Name = console.nextLine();
                }
                if(!Character.isAlphabetic(Name.charAt(i))) {
                    valid = false;
                }
                if(!valid) 
                {
                    System.err.print("Invalid " + name + " Put here again: ");
                    Name = console.nextLine();
                }  
            }
            break;
        }
        return Name;
        
    }

    public static List<String> readUserInput() {
        List<String> userData = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
            while (true) {
                String line = input.nextLine();
                if ("_exit".equalsIgnoreCase(line)) {
                    break;
                }
                userData.add(line);
            }
        return userData;
    }
    
    public static void main(String[] args) throws IOException {
            About_me Saba_ = new About_me();
            Scanner scan = new Scanner(System.in);
            System.out.println("_______");
            System.out.println("(  ____ \\|\\     /|");
            System.out.println("| (    \\/| )   ( |");
            System.out.println("| |      | |   | |");
            System.out.println("| |      ( (   ) )");
            System.out.println("| |       \\ \\_/ / ");
            System.out.println("| (____/\\  \\   /");
            System.out.println("(_______/   \\_/");
            System.out.println();
            System.out.println();
            System.out.println("***************************************************");
            System.out.println();
            System.out.println();
            // first name 
            String first_name =   name_validation("First Name");
            Saba_.setOwner_name(first_name);

            //last name
            String Last_name = name_validation("Last  Name");
            Saba_.setOwner_Surname(Last_name);

            //Birth date
            System.out.print("BirthDate: ");
            String date =  scan.next();
            Saba_.setBirth_date(date);

            //Address is not preferable for all of the users so may they dont want to match it on the CV first ask
            System.out.print("Do you want to put yout Address into yout CV? your answer here:");
            boolean privacy_policy = false;
            String answer = scan.next();
            // if the accept our question with typing yes then it is okay
            if(answer.contains("yes") || answer.equals("1")) {
               privacy_policy = true;
                privacy_policy = true;
                System.out.print("Put your address here:  ");
                String Address = scan.next();
                Saba_.setAddress(Address);
            } 
            Saba_.setWanna_add_address(privacy_policy);

                Scanner input = new Scanner(System.in);
                //Phone number
                System.out.println("Phone number(required):  ");
                String phone_number = input.nextLine();
                Saba_.setPhone_number(phone_number);
                
                //mail acc
                System.out.print("\nE-mail Account: ");
                String mail_acc = input.next();
                Saba_.setMail_account(mail_acc);

                //Web_sites adding
                System.out.print("\nDo you want to add a new Web-sites into your CV? Your answer here: ");
                String web_sites_approved = input.next();
                
                if(web_sites_approved.contains("yes") || web_sites_approved.equals("1")) {
                    Saba_.setWeb_sites_approved(true);
                    System.out.print("Put just the name of the web-sites \n");
                    List<String> websites =  readUserInput();
                    ArrayList<String> website_and_their_links = new ArrayList<String>();
                    System.out.println("Put the links Below");
                    try (Scanner console = new Scanner(System.in)) {
                        for(int i=0;i<websites.size();i++){
                            System.out.println("#" + Integer.toString(i+1) + " ->  "  + websites.get(i) + ": ");
                            String website_link = console.nextLine();
                            website_and_their_links.add(websites.get(i) + ": " + website_link);
                        }
                    }
                    Saba_.setWeb_sites(website_and_their_links);
                } else {
                    Saba_.setWeb_sites_approved(false);
                }
             
                Scanner Input = new Scanner(System.in);
                System.out.println("Wanna add an article about you, " +  first_name + "? Your answer goes here: ");
                String article_approved = Input.nextLine();
                boolean article_approvalence = false;
                String article = "";
                if(article_approved.contains("yes") || article_approved.equals("1")) {
                    article_approvalence = true;
                    while(true){
                        article = article.concat(scan.nextLine());
                        if(article.contains("_exit")){
                            article = article.replace("_exit", "");
                            break;
                        }
                    }
                    System.out.println();
                }
                Saba_.setArticle_approve(article_approvalence);
                Saba_.setArticle_about_me(article);
        
        // Educational Skills 
        Education educational_skillsOf_Saba = new Education();
        ArrayList<Education>Educated = new ArrayList<Education>();
        Scanner education_scanner = new Scanner(System.in);
        boolean education_is_over = false;
            while(!education_is_over){
                System.out.println("Do you want to add some Educational Skills? Your answer Below");
                String user_answer = education_scanner.nextLine();
                if(user_answer.contains("yes") || user_answer.contains("1")){
                    educational_skillsOf_Saba.setIf_wants_to_add_educational_skills(true);
                    //Study Programm
                    System.out.println("Study Program");
                    System.out.println("******************");
                    String Program = education_scanner.nextLine();
                    educational_skillsOf_Saba.setStudy_Program(Program);

                    //Institution  or in general Place of Education
                    System.out.println("Institution/Place of Education");
                    System.out.println("******************");
                    String school_university = education_scanner.nextLine();
                    educational_skillsOf_Saba.setInstitution_Place_of_education(school_university);

                    //from-to
                    System.out.println("From: ");
                    System.out.println("******************");
                    String from = education_scanner.nextLine();
                    
                    System.out.println("If you haven't finished your studies Type 'present' \nTo: ");
                    System.out.println("******************");
                    String to = education_scanner.nextLine();

                    String from_to = from + "-" + to;
                    educational_skillsOf_Saba.setFrom_to(from_to);

                    //City,Country or GPA 
                    System.out.println("Pass below City/Country where you get this education or GPA.");
                    System.out.println("******************");
                    String Optional_data = education_scanner.nextLine();
                    educational_skillsOf_Saba.setCity_Country_GPA(Optional_data);

                    //courses and subjectives
                    System.out.println("******************");
                    System.out.println("Write down the courses you have taken at " + school_university );
                    System.out.println("!!Notice!!  You can stop providing courses anytime with just typing '_exit'");
                    System.out.println("******************");
                    List<String> Courses = readUserInput();
                    ArrayList<String>Courses_and_Their_Subjectives =  new ArrayList<String>();
                    for (String element : Courses) {
                        Courses_and_Their_Subjectives.add(element);
                    }
                    Educated.add(educational_skillsOf_Saba);
                } else {
                    education_is_over = true;
                }
            }
        //Skills
        Skills soft_hard_Skills = new Skills();
        System.out.println("Put your Soft and Hard Skills Below");
        List<String> Saba_s_Skills  = readUserInput();
        soft_hard_Skills.setSKILLS(Saba_s_Skills);


        //Languages
        Language_Skills Bonjour = new Language_Skills();
        System.out.println("Time to Test your Language Skills");
        boolean wanna_continue = true;
        List<String> List_of_the_Languages  = new ArrayList<String>();
        while(wanna_continue)
        {
                Scanner baby_scanner = new Scanner(System.in);
                System.out.println("Do you want to provide a new  Language Skills into your Cv?  Your answer below");
                String USER_answer = new String();
                USER_answer = baby_scanner.nextLine();
                if(USER_answer.contains("yes") ||  USER_answer.contains("1")){
                    System.out.println("Language ");
                    String Language  = baby_scanner.nextLine();
                    String Proficiency ="";
                    System.out.println("Evaluate Your  Proficiency in " + Language + " from 0 to 5");
                    float Level_Proficiency = baby_scanner.nextFloat();
                    if(Level_Proficiency >= 5)
                    {   
                        System.out.println("So you have Native/Billingual Proficiency" );
                        Proficiency = Proficiency.concat("Native/Billingual Proficiency");
                        List_of_the_Languages.add("Language: " + Language + " - > Proficiency: " + Proficiency);
                        continue;
                    }
                    else 
                    {
                        if(Level_Proficiency >=4)
                        {    
                            System.out.println("So you have Full Professional Proficiency" );
                            Proficiency = Proficiency.concat("Full Professional Proficiency");
                            List_of_the_Languages.add("Language: " + Language + " - > Proficiency: " + Proficiency);
                            continue;
                        }
                        else if(Level_Proficiency >=3)
                        {    
                            System.out.println("So you have Professional Working Proficiency." );
                            Proficiency = Proficiency.concat("Professional Working Proficiency.");
                            List_of_the_Languages.add("Language: " + Language + " - > Proficiency: " + Proficiency);
                            continue;
                        }
                        else if(Level_Proficiency >=2)
                        {     
                            Proficiency = Proficiency.concat("Limited Working Proficiency.");
                            System.out.println("So you have  Limited Working Proficiency." );
                            List_of_the_Languages.add("Language: " + Language + " - > Proficiency: " + Proficiency);
                            continue;
                        }
                        else if(Level_Proficiency >=1)
                        {      
                            System.out.println("So you have Elementary Proficiency");
                            Proficiency = Proficiency.concat(" Elementary Proficiency");
                            List_of_the_Languages.add("Language: " + Language + " - > Proficiency: " + Proficiency);
                            continue;
                        }
                        else if(Level_Proficiency >=0 || Level_Proficiency <0)
                        { 
                            Proficiency = Proficiency.concat("No Proficiency");
                            System.out.println("So you have No Proficiency. At this lowest level, there is basically no knowledge of the language.");
                            List_of_the_Languages.add("Language: " + Language + " - > Proficiency: " + Proficiency);
                            continue;
                        }
                    }            
                } 
                else {
                    wanna_continue  = false;
                    break;
                }
            }
        
        Bonjour.setLanguage_and_Proficiency(List_of_the_Languages);
        Bonjour.printInfo();



        //Work_Experience
        System.out.println("**************   Work Experience   **************");
        System.out.println("((((((((((((((((((((((((((((((((((((((((((((((((((");
        System.out.println("((((((((((((((((((((((((((((....((((((((((((((((((");
        System.out.println("((((((,,,,,,,,,,,,,,,,,,,(.&&&&&&.((((((((((((((((");
        System.out.println("((((((,,,,,,,,,,,,,,,,,,,(%&(&@(&&&&((((((((((((((");
        System.out.println("((((((,,,,,,,,,,,,,,,,,,,**&&&&&&*@****/((((((((((");
        System.out.println("((((#@,,,,,,,,,**,,,,,,,,***&&&@********((((((((((");
        System.out.println("(((#%%%,,,,,,,,**,,,,,,,,****((**********(((((((((");
        System.out.println("(((%@@@@@@@@@@@**************#************((((((((");
        System.out.println("(((((**@@@@@@@@**@***********&&&*****(****@@@@(@((");
        System.out.println("(*************************************************");
        System.out.println("((((((((((((((((((((((((((((((((((((((((((((((((((");

        System.out.println("Since CV is needed to be completed for applying job at least 1 working experience is needed to be written");
        List<Work_Experience> Working_experiences = new ArrayList<>();
        int temp = 0;
        boolean has_worked = true;

        do {
            Work_Experience occupation = new Work_Experience();
                Scanner working_scanner = new Scanner(System.in);
                if(temp > 0){
                    System.out.println("Do you want to put some New Working Experiences? Your answer Below");
                    String answe = working_scanner.nextLine();
                    if(!(answe.contains("yes")) && !(answe.contains("1"))){
                        break;
                    }
                }
                //Title/Position
                System.out.println("Title/Position Below");
                String Title = working_scanner.nextLine(); 
                occupation.setTitle_position(Title);
      
                //Workplace/Company
                System.out.println("Workplace/Company");
                String Company = working_scanner.nextLine(); 
                occupation.setWorkplace_Complany(Company);
                
                //From -to 
                System.out.println("From: ");
                String from = working_scanner.nextLine();
                //To
                System.out.println("Put present if you are still applyed for this job");
                System.out.println("To: ");
                String to = working_scanner.nextLine();
                //From-to concatenation behind the scene
                String from_to = from.concat("-"  + to);
                occupation.setFrom_to(from_to);
                
                //City-Country
                System.out.println("Would you like to highlight where you gained this experience? Your answer here: ");
                String City_Country_approved = working_scanner.nextLine();
                boolean needed = false;
                if(City_Country_approved.contains("yes") || City_Country_approved.contains("1") ){
                    needed = true;
                    occupation.setCity_country_is_needed(true);
                    System.out.println("So Comment out some info here     !!! Saba Dont forget to check the length of the strings");
                    String City_country = working_scanner.nextLine();
                    occupation.setCity_country(City_country);
                }
                occupation.setCity_country_is_needed(needed);
                
                //Company Description
                System.out.println("Would you like to add a little demo to refer to company's responsibilites? Your answer here: ");
                String desc_approved = working_scanner.nextLine();
                boolean needed_ = false;
                if(desc_approved.contains("yes") || desc_approved.contains("1") ){
                    needed_ = true;
                    occupation.setCompany_description_is_needed(true);
                    System.out.println("So Put some Description Below     !!! Saba Dont forget to check the length of the strings");
                    String Company_Description = working_scanner.nextLine();
                    occupation.setCompany_description(Company_Description);
                }
                occupation.setCompany_description_is_needed(needed_);    
                
                //Tasks/Responsibilities
                System.out.println("Tasks and Responsibilities Put below");
                List<String>Tasks = readUserInput();
                ArrayList<String>achievement_Tasks = new ArrayList<String>();
                for(String Achievement : Tasks){
                    achievement_Tasks.add(Achievement);
                }
                occupation.setAchievement_Tasks(achievement_Tasks);
                
                //Contact info of Company
                System.out.println("Would you like to add Contact info of Your Company? Your answer here: ");
                String contact_approved = working_scanner.nextLine();
                boolean _needed_ = false;
                if(contact_approved.contains("yes") || contact_approved.contains("1") ){
                    needed_ = true;
                    occupation.setContact_Info_approved(true);  
                    System.out.println("Contact Person");
                    String Contact_Person = working_scanner.nextLine();
                    System.out.println("Contact Info");
                    String Contact_Info = working_scanner.nextLine();
                    occupation.setContact_Info("Contact_Person" + Contact_Person  + "\nContact Info: " + Contact_Info);
                }
                occupation.setContact_Info_approved(_needed_);
            
            Working_experiences.add(occupation);
            temp += 1;    
        } while(has_worked);



        // Organizations
        List<Organizations> organisations = new ArrayList<>();
        boolean Loop_should_interrupt = false;
        while(!Loop_should_interrupt)
        {    
            Organizations organization = new Organizations();
                Scanner another_object = new Scanner(System.in);
                String Organization_name, From, to__, role_is_useful;
                boolean Role_is_useful = false;
                
                System.out.println("Do you want to add some  Organizations ? Your answer Below ");
                String User_answered = another_object.nextLine();
                if(User_answered.contains("yes") || User_answered.contains("1"))
                {System.out.println("Organization Name");
                Organization_name = another_object.nextLine();
                organization.setOrganization_name(Organization_name);
                System.out.println("From:");
                From = another_object.nextLine();
                System.out.println("to:");
                to__ = another_object.nextLine();
                organization.setFrom_to(From + " - " + to__);
                System.out.println("is Necessary to add your role in this organization? Put your answer Below");
                role_is_useful = another_object.nextLine();
                if(role_is_useful.contains("yes") || role_is_useful.contains("1"))
                {
                    Role_is_useful = true;
                    organization.setRole_is_needed(Role_is_useful);
                    System.out.println("put your Role(S) Below End Input By pressing '_exit'");
                    List<String> Responsibilities = readUserInput();
                    organization.setRole(Responsibilities);
                }
                organization.setRole_is_needed(Role_is_useful);
                System.out.println();
                organisations.add(organization);} else {
                    Loop_should_interrupt = true;
                }
            }

        //Certificates_or_Courses
        List<Certificates> Certified = new ArrayList<>();
        while(true)
            {
                    Scanner certificate_scanner = new Scanner(System.in);
                    Certificates Bachelor_Degree = new Certificates();
                    String Certificate_name, FROM_, TO_, Description_is_needed;
                    boolean description_is_needed = false;

                    System.out.println("Add a New Certificate? Your answer Below");
                    String USER_ANSWERED = certificate_scanner.nextLine();
                    if(USER_ANSWERED.contains("yes") || USER_ANSWERED.contains("1")){System.out.println("Certification Name");
                    Certificate_name = certificate_scanner.nextLine();
                    Bachelor_Degree.setCertificate_Name(Certificate_name);
                    System.out.println("From:");
                    FROM_ = certificate_scanner.nextLine();
                    System.out.println("To: Put Present If you Still are in progress to gain this Certificate , Press Just Enter If you dont want to set To: -> Info");
                    TO_ = certificate_scanner.nextLine();
                    Bachelor_Degree.setFROM_TO(FROM_ + " - " + TO_);
                    System.out.println("Do you want to add a Description Below?");
                    Description_is_needed = certificate_scanner.nextLine();
                    if(Description_is_needed.contains("yes") || Description_is_needed.contains("1")){
                        description_is_needed = true;
                        Bachelor_Degree.setDescription_is_needed(description_is_needed);
                        System.out.println("Put the Description Below");
                        String Description = "";
                        while(true){
                            Description = Description.concat(certificate_scanner.nextLine());
                            if(Description.contains("_exit")){
                                Description = Description.replace("_exit", "");
                                Bachelor_Degree.setDescription(Description);
                                break;
                            }
                        }
                    }    
                    Bachelor_Degree.setDescription_is_needed(description_is_needed);
                    Certified.add(Bachelor_Degree);
                    } else {
                        break;
                    }
                }
        //Personal Projects
        List<Personal_Projects> projections = new ArrayList<>();
        while(true){
                Scanner Projects = new Scanner(System.in);
                String project_name, __from__, __to__;
                Personal_Projects personal_projects = new Personal_Projects();
                List<String> Description_of_achievememts = new ArrayList<String>();
                System.out.println("Do you want to add some Personal Projects Into yout CV? Put your answer Below");
                String __answer__ = Projects.nextLine();
                if(__answer__.contains("yes") || __answer__.contains("1"))
                {    System.out.println("Project Name");
                    project_name = Projects.nextLine();
                    personal_projects.setProject_Name(project_name);
                    System.out.println("From: ");
                    __from__ = Projects.nextLine();
                    System.out.println("To:");
                    __to__ = Projects.nextLine();
                    personal_projects.setFrom_To(__from__ + " - " + __to__);
                    System.out.println("Description of Achievements");
                    Description_of_achievememts = readUserInput();
                    personal_projects.setDescription(Description_of_achievememts);
                    projections.add(personal_projects);} else { break;}
            }
        
            Scanner textInput = new Scanner(System.in);
            try {
                System.out.print("Name a File: ");
                String Name_of_a_file = textInput.next();
                File Cv_File = new File(Name_of_a_file + ".txt");
                if (Cv_File.createNewFile()) {
                  System.out.println("File created: " + Cv_File.getName());
                } 
                else {
                  System.out.println("File already exists.");
                }
                //Let's Write into a file
                try {
                    FileWriter Cv_Maker = new FileWriter(Name_of_a_file + ".txt");
                    // System.out.println();
                    Saba_.printInfo(Cv_Maker);
                    Cv_Maker.write("\n" + "**************   Education   **************" +"\n");
                    for(Education educations : Educated){
                        educations.printInfo(Cv_Maker);
                    }
                    Cv_Maker.write("__          __        _      ______                      _                                 "+"\n");  
                    Cv_Maker.write("\\ \\        / /       | |    |  ____|                    (_)                              "+"\n");  
                    Cv_Maker.write(" \\ \\  /\\  / /__  _ __| | __ | |__  __  ___ __   ___ _ __ _  ___ _ __   ___ ___          "+"\n");  
                    Cv_Maker.write("  \\ \\/  \\/ / _ \\| '__| |/ / |  __| \\ \\/ / '_ \\ / _ \\ '__| |/ _ \\ '_ \\ / __/ _ \\ "+"\n");  
                    Cv_Maker.write("   \\  /\\  / (_) | |  |   <  | |____ >  <| |_) |  __/ |  | |  __/ | | | (_|  __/          "+"\n");  
                    Cv_Maker.write("    \\/  \\/ \\___/|_|  |_|\\_\\ |______/_/\\_\\ .__/ \\___|_|  |_|\\___|_| |_|\\___\\___| "+"\n");  
                    Cv_Maker.write("                                        | |                                                "+"\n");  
                    Cv_Maker.write("                                        |_|                                                "+"\n");  
                    for(Work_Experience job: Working_experiences){
                        job.printInfo(Cv_Maker);
                    }
                    soft_hard_Skills.printInfo(Cv_Maker);
                    Cv_Maker.write(" ___  ___  ___   ___   __  _  _   __   __      ___  ___   __    __  ___   __  ____  ___            "+"\n");
                    Cv_Maker.write("(  ,\\(  _)(  ,) / __) /  \\( \\( ) (  ) (  )    (  ,\\(  ,) /  \\  (  )(  _) / _)(_  _)/ __)      "+"\n");
                    Cv_Maker.write(" ) _/ ) _) )  \\ \\__ \\( () ))  (  /__\\  )(__    ) _/ )  \\( () )__)(  ) _)( (_   )(  \\__ \\    "+"\n");
                    Cv_Maker.write("(_)  (___)(_)\\_)(___/ \\__/(_)\\_)(_)(_)(____)  (_)  (_)\\_)\\__/(___/ (___) \\__) (__) (___/     "+"\n");
                    Cv_Maker.write("***************************************************************************************************\n");           
                    for(Personal_Projects item: projections){
                        item.printInfo(Cv_Maker);
                    }
                    Cv_Maker.write("                    _|_|                                            _|                        _|      _|            "+"\n");                    
                    Cv_Maker.write("_|    _|  _|  _|_|    _|_|_|    _|_|_|  _|_|_|        _|_|_|_|    _|_|_|  _|_|_|_|        _|_|    _|_|_|      _|_|_|"+"\n");
                    Cv_Maker.write("_|    _|  _|_|      _|    _|  _|    _|  _|    _|  _|      _|    _|    _|    _|      _|  _|    _|  _|    _|  _|_|    "+"\n");
                    Cv_Maker.write("_|    _|  _|        _|    _|  _|    _|  _|    _|  _|    _|      _|    _|    _|      _|  _|    _|  _|    _|      _|_|"+"\n");
                    Cv_Maker.write("  _|_|    _|          _|_|_|    _|_|_|  _|    _|  _|  _|_|_|_|    _|_|_|      _|_|  _|    _|_|    _|    _|  _|_|_|  "+"\n");
                    Cv_Maker.write("                          _|                                                                                        "+"\n");
                    Cv_Maker.write("                      _|_|                                                                                          "+"\n");
                    Cv_Maker.write("--------------------------------------------------------------------------------------------------------------------"+"\n");
                    for(Organizations Companies  : organisations){
                        Companies.printInfo(Cv_Maker);
                    }
                    Cv_Maker.write("  _____          _   _  __ _           _             "+"\n");
                    Cv_Maker.write("  / ____|        | | (_)/ _(_)         | |           "+"\n");
                    Cv_Maker.write(" | |     ___ _ __| |_ _| |_ _  ___ __ _| |_ ___  ___ "+"\n");
                    Cv_Maker.write(" | |    / _ \\ '__| __| |  _| |/ __/ _` | __/ _ \\/ __|"+"\n");
                    Cv_Maker.write(" | |___|  __/ |  | |_| | | | | (_| (_| | ||  __/\\__ \\"+"\n");
                    Cv_Maker.write("  \\_____\\___|_|   \\__|_|_| |_|\\___\\__,_|\\__\\___||___/"+"\n");
                    Cv_Maker.write("********************************************************"+"\n");                                                
                    for(Certificates Diploma: Certified){
                        Diploma.printInfo( Cv_Maker);
                    }
                    Bonjour.printInfo(Cv_Maker);
                    Cv_Maker.close();
                    System.out.println("Successfully wrote to the file.");
                } 
                catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            } 
            catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
