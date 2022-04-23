package SV.TheFirstAid;

import SV.TheFirstAid.processors.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class TheFirstAidBot extends TelegramLongPollingBot {
    private Processor processor;

    @Override
    public String getBotUsername() {
        return "FirstAid_by_SV_bot";
    }

    @Override
    public String getBotToken() {
        return "5197475909:AAGLxNHbjJ-zduAv-gg3m7aZAQElsOCx39g";
    }

    @Override
    public void onUpdateReceived(Update update) {
        processor.process(update);
    }
    @Autowired
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}

