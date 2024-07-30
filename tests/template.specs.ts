import { test,expect, type Page } from '@playwright/test';
import {HomePage } from '../pages/home-page';
// AAA arrange act assert
const URL='https://jawahrecmsweb.just4share.com/en';
let homePage: HomePage;

test.beforeEach
(
    async({page}) =>

    {
    await page.goto(URL);
    homePage=new HomePage(page);
    }
);

async function clickOnLoginBtn(page:Page)
{
    await homePage.clickOnLogin();
}

test.describe('jawaherScenario',() =>
    {
        test('login',async({page}) => {
            await clickOnLoginBtn(page);
        })
    }
)