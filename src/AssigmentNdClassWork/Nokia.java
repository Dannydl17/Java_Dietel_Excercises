package AssigmentNdClassWork;

import javax.swing.text.html.Option;
import java.util.Objects;
import java.util.Scanner;



public class Nokia {
    static Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to your Nokia phone");
         menu();
         phoneBook();
         messages();
         chat();
         callRegister();
         tones();
         setting();
         callDivert();
         games();
    }

    private static void menu() {
        System.out.println("List of menu functions");
        System.out.println(
                """
                1.Phone book
                2.Messages
                3.Chat
                4.Call register
                5.Tones
                6.Settings
                7.Call divert
                8.Games
                9.Calculator
                10.Remainder
                11.Clock
                12.Profile
                13.Sim services
                """
        );
        System.out.print("Enter a number:  ");
        int userInput = keyboardInput.nextInt();

        while (userInput <= 13){
            switch (userInput){
                case 1:
                    phoneBook();
                    break;
                case 2:
                    messages();
                    break;
                case 3:
                    chat();
                    break;
                case 4:
                    callRegister();
                    break;
                case 5:
                    tones();
                    break;
                case 6:
                    setting();
                    break;
                case 7:
                    callDivert();
                    break;
                case 8:
                    games();
                    break;
                case 9:
                    calculator();
                    break;
                case 10:
                    reminder();
                    break;
                case 11:
                    clock();
                    break;
                case 12:
                    profile();
                    break;
                case 13:
                  simServices();
                  break;
            }
        }
    }

    private static void phoneBook() {
        System.out.println("Phone book");
        System.out.println(
                """
                1.Search
                2.Services Nos
                3.Add name
                4.Erase
                5.Edit
                6.Assign tone
                7.Send b'card
                8.Option
                9.Speed dials
                10.Voice tags
                """
        );
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("8")) {
            option();
        } else if (userInput.equals("0")) {
            menu();
        }
        else {
            phoneBook();
        }


    }

    private static void option() {
        System.out.println("Option");
        System.out.println(
                """
                1.Type of view
                2.Memory status
                """
        );
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")){
            TypeOfView();
        } else if (userInput.equals("2")) {
            memoryStatus();
        } else if (userInput.equals("0")) {
            phoneBook();
        } else {
            option();
        }
    }

    private static void TypeOfView() {
        System.out.println("Types of view");
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            option();
        }
    }

    private static void memoryStatus() {
        System.out.println("Memory status");
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            option();
        }
    }

    private static void messages() {
        System.out.println("Messages");
        System.out.println(
                """
                1.Write messages
                2.Inbox
                3.Outbox
                4.Picture messages
                5.Templates
                6.Smileys
                7.Messages settings
                8.Info service
                9.Voice mailbox numbers
                10.Service command editor
                """
                );
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = String.valueOf(keyboardInput.nextInt());
        if (userInput.equals("7")) {
            messagesSettings();
        } else if (userInput.equals("0")) {
            menu();
        }
        else {
            messages();
        }

    }

    private static void messagesSettings() {
        System.out.println("Messages setting");
        System.out.println(
                """
                1.Set1
                2.Common3
                """
               );
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = String.valueOf(keyboardInput.nextInt());
        if (userInput.equals("1")){
            set1();
        } else if (userInput.equals("2")) {
            common3();
        }
        else {
            messagesSettings();
        }
    }

    private static void set1() {
        System.out.println("Set1");
        System.out.println(
                """
                1.Messages center number
                2.Message sent as
                3.Message validity
                """
        );
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = String.valueOf(keyboardInput.nextInt());
        if (userInput.equals("1")) {
            messageCenterNumber();
        }
        else if (userInput.equals("2")) {
            messageSentAs();
        }
        else if (userInput.equals("3")) {
            messageValidity();
        }else if (userInput.equals("0")) {
            messages();
        } else {
            messagesSettings();
        }
    }

    private static void messageCenterNumber() {
        System.out.println("Message centre number");
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            set1();
        }
    }
    private static void messageSentAs() {
        System.out.println("Message sent as");
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            set1();
        }
    }

    private static void messageValidity() {
        System.out.println("Message validity");
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            set1();
        }
    }
    private static void common3() {
        System.out.println("Common 3");
        System.out.println(
                """
                1.Delivery reports
                2.Reply via same centre
                3.Character support
                """
        );
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = String.valueOf(keyboardInput.nextInt());
        if (userInput.equals("1")) {
            deliveryReport();
        } else if (userInput.equals("2")) {
            replyViaSameCenter();
        } else if (userInput.equals("3")) {
            characterSupport();
        }else if (userInput.equals("0")) {
            messages();
        } else {
            messagesSettings();
        }
    }

    private static void deliveryReport() {
        System.out.println("DeliverY reports");
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            common3();
        }
    }

    private static void replyViaSameCenter() {
        System.out.println("Reply via same centre");
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            common3();
        }
    }

    private static void characterSupport() {
        System.out.println("Character support");
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            common3();
        }
    }
    private static void chat() {
        System.out.println("Character support");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("0")) {
           menu();
        }
    }

    private static void callRegister() {
        System.out.println("Call register");
        System.out.print(
                """
                1.Missed calls
                2.Received calls
                3.Dialled numbers
                4.Erase recent call lists
                5.Show call duration
                6.Show call costs
                7.Call cost settings
                8.Prepaid credit
                """
        );
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = String.valueOf(keyboardInput.nextInt());
        if (userInput.equals("5")) {
            showCallDuration();
        } else if (userInput.equals("6")) {
            showCallCost();
        } else if (userInput.equals("7")) {
            callCostSetting();
        }else if (userInput.equals("0")) {
            menu();
        }
        else {
            callRegister();
        }
    }

    private static void showCallDuration() {
        System.out.println("Show call duration");
        System.out.println(
                """
                1.Last call duration
                2.All calls' duration
                3.Received calls' duration
                4.Dialled calls' duration
                5.Clear timers
                """
        );
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = String.valueOf(keyboardInput.nextInt());
        if (userInput.equals("1")){
            lastCallDuration();
        }
        else if (userInput.equals("2")) {
            allCallsDuration();
        }
        else if (userInput.equals("3")) {
            receivedCallsDuration();
        }
        else if (userInput.equals("4")) {
            dialledCallsDuration();
        }
        else if (userInput.equals("5")) {
            clearTimers();
        } else if (userInput.equals("0")) {
            menu();
        }
        else {
            showCallDuration();
        }
    }

    private static void lastCallDuration() {
        System.out.println("Last call duration");
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            showCallDuration();
        }
    }

    private static void allCallsDuration() {
        System.out.println("All calls' duration");
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            showCallDuration();
        }
    }

    private static void receivedCallsDuration() {
        System.out.println("Received calls' duration");
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            showCallDuration();
        }
    }

    private static void dialledCallsDuration() {
        System.out.println("Dialled calls' duration");
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            showCallDuration();
        }
    }

    private static void clearTimers() {
        System.out.println("Clear timers");
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            showCallDuration();
        }
    }

    private static void showCallCost() {
        System.out.println("Show call costs");
        System.out.println(
                """
                1.Last call cost
                2.All calls' cost
                3.Clear counters
                """
        );
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = String.valueOf(keyboardInput.nextInt());
        if (userInput.equals("1")){
            lastCallCost();
        }
        else if (userInput.equals("2")) {
            allCallsCost();
        }
        else if (userInput.equals("3")) {
            clearCounters();
        } else if (userInput.equals("0")) {
            menu();
        }
        else {
            showCallCost();
        }
    }

    private static void lastCallCost() {
        System.out.println("Last call cost");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            showCallCost();
        }
    }

    private static void allCallsCost() {
        System.out.println("All calls' cost");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            showCallCost();
        }
    }

    private static void clearCounters() {
        System.out.println("Clear counters");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            showCallCost();
        }
    }

    private static void callCostSetting() {
        System.out.println("Call cost setting");
        System.out.println(
                """
                1.Call cost limit
                2.Show cost in
                """
        );
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = String.valueOf(keyboardInput.nextInt());
        if (userInput.equals("1")){
            callCostLimit();
        }
        else if (userInput.equals("2")) {
            showCostIn();
        } else if (userInput.equals("0")) {
            menu();
        }
        else {
            callCostSetting();
        }
    }

    private static void callCostLimit() {
        System.out.println("Call cost limit");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            callCostSetting();
        }
    }

    private static void showCostIn() {
        System.out.println("Show costs in");
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            callCostSetting();
        }
    }

    private static void tones() {
        System.out.println("Tones");
        System.out.println(
                """
                1.Ringing tone
                2.Ringing volume
                3.Incoming call alert
                4.Composer
                5.Message alert tone
                6.Keypad tones
                7.Warming and game tones
                8.Vibrating alert
                9.Screen saver
                """
        );
        System.out.print("Enter press 0 to go back: ");
        String userInput = String.valueOf(keyboardInput.nextInt());
        if (userInput.equals("0")) {
            menu();
        }
    }

    private static void setting() {
        System.out.println("Settings");
        System.out.println(
                """
                1.Call settings
                2.Phone settings
                3.Security settings
                4.Restore factory settings
                """
        );
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = String.valueOf(keyboardInput.nextInt());
        if (userInput.equals("1")){
            callSettings();
        }
        else if (userInput.equals("2")) {
            phoneSettings();
        }
        else if (userInput.equals("3")) {
            securitySettings();
        } else if (userInput.equals("4")) {
            restoreFactorySettings();
        }
        else if (userInput.equals("0")) {
            menu();
        }
        else {
            setting();
        }
    }

    private static void callSettings() {
        System.out.println("Call settings");
        System.out.println(
                """
                1.Automatic redial
                2.Speed dialling
                3.Call waiting options
                4.Own number sending
                5.Phone line in use
                6.Automatic answer
                """
        );
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = String.valueOf(keyboardInput.nextInt());
        if (userInput.equals("1")){
            automaticRedial();
        }
        else if (userInput.equals("2")) {
            speedDialling();
        }
        else if (userInput.equals("3")) {
            callWaitingOptions();
        } else if (userInput.equals("4")) {
            ownNumberSending();
        } else if (userInput.equals("5")) {
            phoneLineInUse();
        } else if (userInput.equals("6")){
            automaticAnswer();
        } else if (userInput.equals("0")) {
            setting();
        } else {
            callSettings();
        }
    }

    private static void automaticRedial() {
        System.out.println("Automatic Redial");
        System.out.print("Enter press 1 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            callSettings();
        }
    }

    private static void speedDialling() {
        System.out.println("Speed dialling");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            callSettings();
        }
    }

    private static void callWaitingOptions() {
        System.out.println("Call waiting options");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            callSettings();
        }
    }

    private static void ownNumberSending() {
        System.out.println("Own number sending");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            callSettings();
        }
    }

    private static void phoneLineInUse() {
        System.out.println("Phone line in use");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            callSettings();
        }
    }

    private static void automaticAnswer() {
        System.out.println("Automatic answer");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            callSettings();
        }
    }

    private static void phoneSettings() {
        System.out.println("Phone settings");
        System.out.println(
                """
                1.Language
                2.Cell info display
                3.Welcome note
                4.Network selection
                5.Light
                6.Confirm sim services actions
                """
        );
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = String.valueOf(keyboardInput.nextInt());
        if (userInput.equals("1")){
            language();
        }
        else if (userInput.equals("2")) {
            cellInfoDisplay();
        }
        else if (userInput.equals("3")) {
            welcomeNote();
        } else if (userInput.equals("4")) {
            networkSelection();
        } else if (userInput.equals("5")) {
            light();
        } else if (userInput.equals("6")){
            confirmSimServiceActions();
        } else if (userInput.equals("0")) {
            setting();
        } else {
            phoneSettings();
        }
    }

    private static void language() {
        System.out.println("Language");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            phoneSettings();
        }
    }

    private static void cellInfoDisplay() {
        System.out.println("Cell info display");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            phoneSettings();
        }
    }

    private static void welcomeNote() {
        System.out.println("Welcome note");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            phoneSettings();
        }
    }

    private static void networkSelection() {
        System.out.println("Network selection");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            phoneSettings();
        }
    }

    private static void light() {
        System.out.println("Lights");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            phoneSettings();
        }
    }

    private static void confirmSimServiceActions() {
        System.out.println("Confirm Sim service actions");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            phoneSettings();
        }
    }

    private static void securitySettings() {
        System.out.println("Security settings");
        System.out.println(
                """
                1.Pin code request
                2.Call barring service
                3.Fixed dialling
                4.Closed user group
                5.Phone security
                6.Change access codes
                """
        );
        System.out.print("Enter a number or press 0 to go back: ");
        String userInput = String.valueOf(keyboardInput.nextInt());
        if (userInput.equals("1")){
            pinCodeRequest();
        }
        else if (userInput.equals("2")) {
            callBarringService();
        }
        else if (userInput.equals("3")) {
            fixedDialling();
        } else if (userInput.equals("4")) {
            closedUserGroup();
        } else if (userInput.equals("5")) {
            phoneSecurity();
        } else if (userInput.equals("6")){
            changeAccessCodes();
        } else if (userInput.equals("0")) {
            setting();
        } else {
            securitySettings();
        }
    }

    private static void pinCodeRequest() {
        System.out.println("Pin code request");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            securitySettings();
        }
    }

    private static void callBarringService() {
        System.out.println("Call barring service");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            securitySettings();
        }
    }

    private static void fixedDialling() {
        System.out.println("Fixed dialling");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            securitySettings();
        }
    }

    private static void closedUserGroup() {
        System.out.println("Closed user group");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            securitySettings();
        }
    }

    private static void phoneSecurity() {
        System.out.println("Phone security");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            securitySettings();
        }
    }

    private static void changeAccessCodes() {
        System.out.println("Change access codes");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("1")) {
            securitySettings();
        }
    }

    private static void restoreFactorySettings() {
        System.out.println("Restore factory settings");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("0")) {
            menu();
        }
        else {
            setting();
        }
    }

    private static void callDivert() {
        System.out.println("Call divert");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("0")) {
            menu();
        }
    }

    private static void games() {
        System.out.println("Games");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("0")) {
            menu();
        }
    }

    private static void calculator() {
        System.out.println("Calculator");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("0")) {
            menu();
        }
    }

    private static void reminder() {
        System.out.println("Reminder");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("0")) {
            menu();
        }
    }

    private static void clock() {
        System.out.println("Clock");
        System.out.print(
                """
                1.Alarm clock
                2.Clock settings
                3.Date setting
                4.Stopwatch
                5.Countdown timer
                6.Auto update of date and time
                """
        );
        System.out.print("Enter press 0 to go back: ");
        String userInput = String.valueOf(keyboardInput.nextInt());
        if (userInput.equals("0")) {
            menu();
        }
    }

    private static void profile() {
        System.out.println("Profile");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("0")) {
            menu();
        }
    }

    private static void simServices() {
        System.out.println("Sim services");
        System.out.print("Enter press 0 to go back: ");
        String userInput = keyboardInput.next();
        if (userInput.equals("0")) {
            menu();
        }
    }
}



