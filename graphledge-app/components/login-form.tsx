import { Button } from "@nextui-org/react";

export default function LoginFormComponent() {
    return (
        <div className="p-32">
            <div className="flex flex-col items-center gap-4">
                <div className="flex w-full">
                   <h1 className="text-2xl font-semibold">Sign in to graphledge</h1>
                </div>
                <Button size="lg" fullWidth >
                    <img src="github.png" width={16} />
                    Sign in with Github
                </Button>
                <Button size="lg" fullWidth>
                    <img src="google.png" width={16} />
                    Sign in with Google
                </Button>
            </div>
        </div>
    )
}