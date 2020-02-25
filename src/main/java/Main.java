import games.WaifuRPG;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import objects.Waifu;
import objects.WaifuList;

import java.io.File;
import java.io.IOException;



import javax.security.auth.login.LoginException;
import javax.xml.bind.JAXBException;

public class Main extends ListenerAdapter {

    static WaifuRPG game;
    String FILE_DIRECTORY = "src\\images\\";
    public static void main(String[] args) throws LoginException, IOException, JAXBException {

        game = new WaifuRPG(); //Loads assets

        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "NjgxNjY4MjQxMTM1MTA4MTY5.XlRzJw.1iruKCJtqHTee0adiRnyvUC2sT4";
        builder.setToken(token);

        builder.addEventListener(new Main());

        builder.buildAsync();


    }


    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        System.out.println("Message from " + event.getAuthor().getName() + " was received:" + event.getMessage().getContentDisplay());



        if(event.getMessage().getContentRaw().equals("waifu.grant")){

            Waifu waifu = game.giveWaifu();

            event.getChannel().sendMessage(waifu.toString()).addFile((new File(FILE_DIRECTORY + waifu.getFilename()))).queue();

        }


    }




}
