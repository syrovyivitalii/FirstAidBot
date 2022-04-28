package SV.TheFirstAid.handlers;

import SV.TheFirstAid.aid.*;
import SV.TheFirstAid.messagesender.MessageSender;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Component
public class MessageHandler implements Handler<Message> {
    //екземпляри класів
    Bleeding bleeding = new Bleeding();
    BoneInjuries boneInjuries = new BoneInjuries();
    Burns burns = new Burns();
    CardiopulmonaryResuscitation CPR = new CardiopulmonaryResuscitation();
    GunshotWound gunshotWound = new GunshotWound();
    Services services = new Services();
    TraumaticBrainInjury traumaticBrainInjury = new TraumaticBrainInjury();
    ForStudent forStudent = new ForStudent();
    ChestInjury chestInjury = new ChestInjury();
    SpineInjury spineInjury = new SpineInjury();
    //надіслати повідомлення
    private final MessageSender messageSender;
    public MessageHandler(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public void choose(Message message) {
        if (message.hasText()) {
            //вивести повідомлення в консоль
            System.out.println(message.getText());
            //надсилати повідомлення в конкретний чат
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(String.valueOf(message.getChatId()));
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
                case "Вогнепальне поранення\uD83D\uDD2B":
                    sendMessage.setText(gunshotWound.gunshotWoundDemo());
                    //inline повідомлення
                    sendMessage.setReplyMarkup(inlineCPRKeyboardMarkup());
                    break;
                //ЧМТ
                case "Черепно-мозкова травма\uD83E\uDDE0":
                    sendMessage.setText(traumaticBrainInjury.traumaticBrainInjuryDemo());
                    //inline повідомлення
                    sendMessage.setReplyMarkup(inlineCPRKeyboardMarkup());
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
                //травми грудної клітки
                case "Травми грудної клітки\uD83D\uDC55":{
                    sendMessage.setText(chestInjury.chestInjuryDemo());
                    ReplyKeyboardMarkup keyboardChest = chestInjury.getChestKeyBoardDemo();
                    sendMessage.setReplyMarkup(keyboardChest);
                    break;
                }
                //проникаюча травма
                case "Проникаюча травма\uD83D\uDD2A":
                    sendMessage.setText(chestInjury.penetratingInjuryDemo());
                    sendMessage.setReplyMarkup(inlineCPRKeyboardMarkup());
                    break;
                //закрита травма
                case "Закрита травма⛑":
                    sendMessage.setText(chestInjury.closedInjuryDemo());
                    sendMessage.setReplyMarkup(inlineCPRKeyboardMarkup());
                    break;
                //травма хребта
                case "Травми хребта⚠️":
                    sendMessage.setText(spineInjury.spineInjuryDemo());
                    ReplyKeyboardMarkup keyboardSpine = spineInjury.getSpineKeyBoardDemo();
                    sendMessage.setReplyMarkup(keyboardSpine);
                    break;
                //безпечне місце
                case "Безпечне місце⛑":
                    sendMessage.setText(spineInjury.safelyPlaceDemo());
                    sendMessage.setReplyMarkup(inlineCPRKeyboardMarkup());
                    break;
                //небезпечне місце
                case "Небезпечне місце⚠️":
                    sendMessage.setText(spineInjury.dangerPlaceDemo());
                    sendMessage.setReplyMarkup(inlineCPRKeyboardMarkup());
                    break;
                //здобувачеві освіти
                case "Здобувачеві освіти\uD83D\uDC68\u200D\uD83C\uDF93":
                    sendMessage.setText("Оберіть: ");
                    ReplyKeyboardMarkup keyboardStudent = forStudent.getStudentKeyBoardDemo();
                    sendMessage.setReplyMarkup(keyboardStudent);
                    break;
                //алгоритм розв'язання ситуаційних задач
                case "Алгоритм розв'язання ситуаційних задач\uD83D\uDCD2":
                    sendMessage.setText(forStudent.algorithmDemo());
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
                    sendMessage.setText("Ви ввели не коректні дані!");
            }
            messageSender.sendMessage(sendMessage);
        }
    }
    private InlineKeyboardMarkup inlineCPRKeyboardMarkup(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("СЛР-Дорослий").callbackData("CPR-Old").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("СЛР-Дитина").callbackData("CPR-Young").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("СЛР-Немовля").callbackData("CPR-Baby").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
}
