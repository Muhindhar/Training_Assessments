import { test, expect} from '../fixtures/basefixture';
import { regdet, csvreader } from '../utilities/csvreader';

const users: regdet[] = csvreader();

test("register page @Smoke", async ({ register }) => {
    await register.loginsite();
    await register.myaccclk();
    for (const user of users) {
        await register.enterdet(user.fname,user.lname,user.email,user.phone,user.password,user.conpassword
        );
    await expect(register.confirm).toHaveText("Your Account Has Been Created!");

    }
});