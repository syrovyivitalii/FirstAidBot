package SV.TheFirstAid.handlers;

import SV.TheFirstAid.aid.*;
import SV.TheFirstAid.messagesender.MessageSender;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
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


    @Override @SneakyThrows
    public void choose(Message message) {
        if (message.hasText()) {
            //вивести повідомлення в консоль
            System.out.println(message.getText());
            //надсилати повідомлення в конкретний чат
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(String.valueOf(message.getChatId()));
            //надсилання фото в конкретний чат
            SendPhoto sendPhoto = new SendPhoto();
            SendPhoto sengPhotoTwo = new SendPhoto();
            SendPhoto sendPhotoThree = new SendPhoto();
            sendPhoto.setChatId(String.valueOf(message.getChatId()));
            sengPhotoTwo.setChatId(String.valueOf(message.getChatId()));
            sendPhotoThree.setChatId(String.valueOf(message.getChatId()));
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
                    sendPhoto.setPhoto(new InputFile("https://green-way.com.ua/storage/app/media/Yulya/pomosh-pri-dtp/glava4/serdechno-legochnaja-reanimacija-2.png"));
                    sengPhotoTwo.setPhoto(new InputFile("https://green-way.com.ua/storage/app/media/Yulya/pomosh-pri-dtp/glava4/neprjamoj-massazh-serdca-1.png"));
                    sendPhotoThree.setPhoto(new InputFile("https://green-way.com.ua/storage/app/media/Yulya/pomosh-pri-dtp/glava4/iskusstvennoe-dyhanie-3.png"));
                    messageSender.sendPhoto(sendPhoto);
                    messageSender.sendPhoto(sengPhotoTwo);
                    messageSender.sendPhoto(sendPhotoThree);
                    break;
                case "Дитина\uD83D\uDC66\uD83C\uDFFC":
                    sendMessage.setText(CPR.CPR_YoungDemo());
                    break;
                case "Немовля\uD83D\uDC76\uD83C\uDFFC":
                    sendMessage.setText(CPR.CPR_BabyDemo());
                    sendPhoto.setPhoto(new InputFile("https://i0.wp.com/tv5.zp.ua/wp-content/uploads/2019/04/SLR-ditini.jpg?fit=500%2C334&ssl=1"));
                    messageSender.sendPhoto(sendPhoto);
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
                    sendPhoto.setPhoto(new InputFile("https://green-way.com.ua/storage/app/media/Yulya/pomosh-pri-dtp/glava4/nalozhenie-davjashhej-povjazki-na-sheju.png"));
                    messageSender.sendPhoto(sendPhoto);
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
                    sendPhoto.setPhoto(new InputFile("https://olgrad.kiev.ua/wp-content/uploads/zachem-nuzhna-okkluzivnaya-povyazka.jpg"));
                    messageSender.sendPhoto(sendPhoto);
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
                    sendPhoto.setPhoto(new InputFile("https://adst.mp.pl/s/empendium/img_zoom/B27/23.8-4.jpg"));
                    messageSender.sendPhoto(sendPhoto);
                    break;
                //небезпечне місце
                case "Небезпечне місце⚠️":
                    sendMessage.setText(spineInjury.dangerPlaceDemo());
                    sendMessage.setReplyMarkup(inlineCPRKeyboardMarkup());
                    sendPhoto.setPhoto(new InputFile("https://adst.mp.pl/s/empendium/img_zoom/B27/23.8-4.jpg"));
                    messageSender.sendPhoto(sendPhoto);
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
                //оцінка дій рятувальника
                case "Оцінка дій рятувальника, який знаходиться на місці події\uD83D\uDCD7":
                    sendMessage.setText(forStudent.actionEvaluationDemo());
                    break;
                //алгоритм СЛР
                case "Алгоритм вирішення ситуаційних задач з теми \"СЛР\"\uD83D\uDCD4":
                    sendMessage.setText(forStudent.algorithmCPRDemo());
                    break;
                //алгоритм без ознак смерті
                case "Алгоритм вирішення ситуаційних задач з ДМД при відсутності у них ознак смерті\uD83D\uDCD3":
                    sendMessage.setText(forStudent.algorithmWithoutSignOfDeathDemo());
                    break;
                //алгоритм "Кровотеча"
                case "Алгоритм вирішення ситуаційних задач з теми \"Кровотеча\"\uD83D\uDCD5":
                    sendMessage.setText(forStudent.algorithmBleedingDemo());
                    break;
                //алгоритм "Травматична ампутація"
                case "Алгоритм вирішення ситуаційних задач з теми \"Травматична ампутація\"\uD83D\uDCD9":
                    sendMessage.setText(forStudent.algorithmAmputationDemo());
                    break;
                //алгоритм "ГДН"
                case "Алгоритм вирішення ситуаційних задач з теми \"ГДН\"\uD83D\uDCD8":
                    sendMessage.setText(forStudent.algorithmARFDemo());
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
