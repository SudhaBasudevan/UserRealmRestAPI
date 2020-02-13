@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = " /service/user/realm/{userID}",produces = "application/json")
    public User getUserDetail(@PathVariable Long userID){
        return userService.findById(userID);
    }
}
