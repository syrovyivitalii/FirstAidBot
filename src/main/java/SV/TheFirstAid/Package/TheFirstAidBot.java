package SV.TheFirstAid.Package;

import org.springframework.stereotype.Component;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


@Component
public class TheFirstAidBot extends TelegramLongPollingBot {

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
        if (update.hasMessage()){
            handleMessage(update.getMessage());
        }
    }
    private void handleMessage(Message message){
        if (message.hasText()){
            //вивід повідомлення користувача в консоль
            System.out.println(message.getText());
            //екземпляри класів
            CardiopulmonaryResuscitation CPR = new CardiopulmonaryResuscitation();
            Bleeding bleeding = new Bleeding();
            Burns burns = new Burns();
            GunshotWound gunshotWound = new GunshotWound();
            TraumaticBrainInjury brainInjury = new TraumaticBrainInjury();
            BoneInjuries boneInjuries = new BoneInjuries();
            Services services = new Services();
            //відповідь користувачеві в конкретний чат
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(String.valueOf(message.getChatId()));
            //логіка
            switch (message.getText()) {
                case "/start":
                    String text = "Що трапилось?";
                    //кнопки
                    sendMessage.enableMarkdown(true);
                    ReplyKeyboardMarkup keyboardMarkup = services.getMenuKeyBoardDemo();
                    sendMessage.setReplyMarkup(keyboardMarkup);
                    //відправлення повідомлення користувачу
                    sendMessage.setText(text);
                    break;
                //СЛР
                case "Серцево-легенева реанімація\uD83E\uDEC0\uD83E\uDEC1️":
                    sendMessage.setText(CPR.CPR_Demo());
                    ReplyKeyboardMarkup keyboardCPR = CPR.getCPRKeyBoardDemo();
                    sendMessage.setReplyMarkup(keyboardCPR);
                    break;
                case "Дорослий\uD83D\uDC68\uD83C\uDFFC":
                    sendMessage.setText(CPR.CPR_OldDemo());
                    break;
                case "Дитина\uD83D\uDC66\uD83C\uDFFC":
                    sendMessage.setText(CPR.CPR_YoungDemo());
                    break;
                case "Немовля\uD83D\uDC76\uD83C\uDFFC":
                    sendMessage.setText(CPR.CPR_BabyDemo());
                    break;
                //кровотеча
                case "Кровотеча\uD83E\uDE78":
                    sendMessage.setText(bleeding.bleedingDemo());
                    ReplyKeyboardMarkup keyboardBleeding = bleeding.getBleedingKeyBoardDemo();
                    sendMessage.setReplyMarkup(keyboardBleeding);
                    break;
                case "Зовнішня кровотеча\uD83C\uDFE5":
                    sendMessage.setText(bleeding.externalBleedingDemo());
                    ReplyKeyboardMarkup keyboardExternalBleeding = bleeding.getExternalBleedingKeyboardDemo();
                    sendMessage.setReplyMarkup(keyboardExternalBleeding);
                    break;
                case "Внутрішня кровотеча\uD83C\uDFE5":
                    sendMessage.setText(bleeding.internalBleedingDemo());
                    break;
                case "Ампутація кінцівки\uD83C\uDFE5":
                    sendMessage.setText(bleeding.limbAmputationDemo());
                    break;
                case "Кінцівки\uD83E\uDDB5":
                    sendMessage.setText(bleeding.limbBleedingDemo());
                    break;
                case "Голова/Шия\uD83D\uDC64":
                    sendMessage.setText(bleeding.headNeckBleedingDemo());
                    break;
                case "Живіт\uD83E\uDDCD\uD83C\uDFFC\u200D♂️":
                    sendMessage.setText(bleeding.bodeBleedingDemo());
                    break;
                //опіки/обмороження
                case "Опіки/Обмороження⛑":
                    sendMessage.setText(burns.burnsDemo());
                    ReplyKeyboardMarkup keyboardBurns = burns.getBurnsKeyboardDemo();
                    sendMessage.setReplyMarkup(keyboardBurns);
                    break;
                case "Термічний опік\uD83C\uDF21":
                    sendMessage.setText(burns.thermalBurnsDemo());
                    break;
                case "Хімічний опік⚠️":
                    sendMessage.setText(burns.chemicalBurnsDemo());
                    break;
                case "Електричний опік⚡️":
                    sendMessage.setText(burns.electricBurnsDemo());
                    break;
                case "Обмороження\uD83E\uDD76":
                    sendMessage.setText(burns.frostbiteDemo());
                    break;
                //вогневе поранення
                case "Вогневе поранення\uD83D\uDD2B":
                    sendMessage.setText(gunshotWound.gunshotWoundDemo());
                    //inlineButton(message);
                    break;
                //ЧМТ
                case "Черепно-мозкова травма\uD83E\uDDE0":
                    sendMessage.setText(brainInjury.traumaticBrainInjuryDemo());
                    break;
                //травми кісток
                case "Травми кісток\uD83E\uDDB4":
                    sendMessage.setText(boneInjuries.boneInjuriesDemo());
                    ReplyKeyboardMarkup keyboardBone = boneInjuries.getBoneInjuriesKeyBoardDemo();
                    sendMessage.setReplyMarkup(keyboardBone);
                    break;
                case "\uD83D\uDD39Відкритий перелом":
                    sendMessage.setText(boneInjuries.openFractureDemo());
                    break;
                case "\uD83D\uDD39Закритий перелом":
                    sendMessage.setText(boneInjuries.closedFractureDemo());
                    break;
                case "\uD83D\uDD39Вивих":
                    sendMessage.setText(boneInjuries.dislocationDemo());
                    break;
                //інструкція
                case "Інструкція користувача\uD83D\uDCC4":
                    sendMessage.setText(services.instructionDemo());
                    break;
                //повернутися
                case "Повернутися⬅":
                    sendMessage.setText("Що трапилось?");
                    ReplyKeyboardMarkup keyboardReturn = services.getMenuKeyBoardDemo();
                    sendMessage.setReplyMarkup(keyboardReturn);
                    break;
                default:
                    sendMessage.setText("Вибачте, я не знаю що з цим робити -  " + message.getText());
            }
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}

