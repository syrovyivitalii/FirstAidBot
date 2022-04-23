package SV.TheFirstAid.messagesender;

import SV.TheFirstAid.TheFirstAidBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service

public class MessageSenderImpl implements MessageSender {
    private TheFirstAidBot theFirstAidBot;
    @Override
    public void sendMessage(SendMessage sendMessage) {
        try {
            theFirstAidBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sendEditMessage(EditMessageText editMessageText) {
        try {
            theFirstAidBot.execute(editMessageText);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Autowired
    public void setTheFirstAidBot(TheFirstAidBot theFirstAidBot) {
        this.theFirstAidBot = theFirstAidBot;
    }
}
