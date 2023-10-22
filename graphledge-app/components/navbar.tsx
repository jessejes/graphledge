import { Button, Link, Navbar, NavbarBrand, NavbarContent, NavbarItem } from "@nextui-org/react";

export default function NavbarComponent() {
    return (
        <Navbar>
          <NavbarBrand>
            <p className="font-bold text-inherit">graphledge</p>
          </NavbarBrand>
          <NavbarContent justify="end">
            <NavbarItem>
              <Button as={Link} href="/login" variant="flat">
                Sign in
              </Button>
            </NavbarItem>
          </NavbarContent>
        </Navbar>
    )
}