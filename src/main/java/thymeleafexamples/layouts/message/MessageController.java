package thymeleafexamples.layouts.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Tiles Dialect usage example.
 */
@Controller
class MessageController {

    private MessageRepository messageRepository;

    @Autowired
    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
        init();
    }

    private void init() {
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
        messageRepository.save(new Message("What's up?", "This is a what's up message..."));
        messageRepository.save(new Message("How is going?", "This is a how's going message..."));
    }

    @ModelAttribute("page")
    public String module() {
        return "messages";
    }

    @RequestMapping(value = "message", method = RequestMethod.GET)
    public String messages(Model model) {
        model.addAttribute("messages", messageRepository.findAll());
        // the view will match 'messages/*'; see /WEB-INF/views/message/tiles-defs.xml
        return "message/list";
    }
}
