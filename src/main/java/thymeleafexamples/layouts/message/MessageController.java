package thymeleafexamples.layouts.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Tiles Dialect usage example.
 */
@RestController
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

    @RequestMapping(value = "/message", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Message> messages() {
        return messageRepository.findAll();
    }
}
