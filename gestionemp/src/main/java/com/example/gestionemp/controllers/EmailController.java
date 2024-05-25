package com.example.gestionemp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.gestionemp.models.EmailRequest;
import com.example.gestionemp.services.EmailService;

@Controller
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/email/send")
    public String showEmailForm(Model model) {
        model.addAttribute("emailRequest", new EmailRequest());
        return "emails/sendEmail";
    }

    @PostMapping("/email/send")
    public String sendEmail(@ModelAttribute EmailRequest emailRequest) {
        try {
            if (emailRequest.getBody() != null && !emailRequest.getBody().isEmpty()) {
                emailService.sendSimpleEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getBody());
                System.out.println("ok");
            } else {
                System.out.println("Email body is empty");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return "redirect:/email/success";
    }


    @GetMapping("/email/success")
    public String emailSuccess() {
        return "emails/email-sucess";
    }
}
