import { test, expect } from '../fixtures/basefixture';

test("validate product search @Smoke", async ({ register, search, product }) => {
    await register.loginsite();
    await search.seacrpro("MacBook");
    expect(await product.checkproduct()).toBeTruthy();
});