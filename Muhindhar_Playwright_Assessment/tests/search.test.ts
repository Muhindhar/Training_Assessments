import { test, expect } from '../fixtures/basefixture';

test("Validate Product Search", async ({ register,search, product }) => {
    await register.loginsite();
    await search.seacrpro("MacBook");
    expect(await product.checkproduct()).toBeTruthy();

});