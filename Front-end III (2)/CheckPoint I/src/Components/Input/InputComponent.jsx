import style from "./InputComponent.module.css";

function InputComponent({ title, type, value, fnOnChange }) {
    return (
        <>
            <label className={style.label}>{title ?? "Santo não enviado"}</label>
            <br />

            <input className={style.input}
               
                type={type ?? "text"}
                value={value}
                onChange={fnOnChange}
            />
            <br />
        </>
    );
}

export default InputComponent;