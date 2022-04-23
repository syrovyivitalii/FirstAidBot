package SV.TheFirstAid.handlers;

import SV.TheFirstAid.aid.CardiopulmonaryResuscitation;
import SV.TheFirstAid.messagesender.MessageSender;
import lombok.var;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

@Component
public class CallbackQueryHandler implements Handler <CallbackQuery> {
    private final MessageSender messageSender;
    CardiopulmonaryResuscitation CPR = new CardiopulmonaryResuscitation();

    public CallbackQueryHandler(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public void choose(CallbackQuery callbackQuery){
        Integer messageId = callbackQuery.getMessage().getMessageId();
        var editMessageText = new EditMessageText();
        editMessageText.setChatId(String.valueOf(callbackQuery.getMessage().getChatId()));
        editMessageText.setMessageId(messageId);
        if (callbackQuery.getData().equals("CPR-Old")){
            editMessageText.setText(CPR.CPR_OldDemo());
            messageSender.sendEditMessage(editMessageText);
        }else if (callbackQuery.getData().equals("CPR-Young")){
            editMessageText.setText(CPR.CPR_YoungDemo());
            messageSender.sendEditMessage(editMessageText);
        }else if(callbackQuery.getData().equals("CPR-Baby")){
            editMessageText.setText(CPR.CPR_BabyDemo());
            messageSender.sendEditMessage(editMessageText);
        }
    }
}
