import { type Locator, type Page } from "@playwright/test";

export class HomePage{
    // variables
    readonly page:Page;
    // await page.getByText('Login').click;
    readonly loginBtn: Locator;
    readonly OTP: Locator;
    
    // constructor
    constructor (page:Page)
    {
        this.page = page;
        this.loginBtn=page.getByRole('link', { name: 'Login' });
        this.OTP=page.getByPlaceholder('XXXXXXXX');
    }
    // methods
    async clickOnLogin(){
        await this.loginBtn.click();
    }
    async enterOTP()
    {
        await this.OTP.click;
        await this.OTP.fill('0502010110');
        await this.OTP.press('Enter');
    }

}
export default HomePage;